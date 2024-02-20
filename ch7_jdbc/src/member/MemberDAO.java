package member;

import static member.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO 메소드 작성
 * 1. 실행할 sql 구문 작성
 * 2. insert, update, delete => executeUpdate() (int 로 리턴)
 * 3. select
 *  - 결과 값 한개 라면 : executeQuery() (~DTO 사용)
 *  - 결과 값 여러개 라면 : executeQuery() (List<~DTO> 사용)
 */

public class MemberDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  public int insert(MemberDTO dto) {
    String sql = "INSERT INTO  MEMBERTBL (USERID,PASSWORD,NAME,EMAIL)";
    sql += "values(?,?,?,?)";
    int result = 0;

    con = getConnection();
    try {
      pstmt = con.prepareStatement(sql);
      // ? 해결
      pstmt.setString(1, dto.getUserId());
      pstmt.setString(2, dto.getPassword());
      pstmt.setString(3, dto.getName());
      pstmt.setString(4, dto.getEmail());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public MemberDTO getRow(String userId, String password) {
    con = getConnection();
    MemberDTO memberDTO = null;
    // 개별 회원 조회
    String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, userId);
      pstmt.setString(2, password);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        memberDTO = new MemberDTO();
        memberDTO.setUserId(rs.getString("userid"));
        memberDTO.setPassword(rs.getString("password"));
        memberDTO.setName(rs.getString("name"));
        memberDTO.setEmail(rs.getString("email"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return memberDTO;
  }

  //   public MemberDTO getRow(MemberDTO dto) {
  //     con = getConnection();
  //     MemberDTO memberDTO = null;
  //     // 개별 회원 조회
  //     String sql = "SELECT * FROM MEMBERTBL WHERE USERID = ? AND PASSWORD = ?";

  //     try {
  //       pstmt = con.prepareStatement(sql);
  //       pstmt.setString(1, dto.getUserId());
  //       pstmt.setString(2, dto.getPassword());
  //       rs = pstmt.executeQuery();
  //       if (rs.next()) {
  //         memberDTO = new MemberDTO();
  //         memberDTO.setUserId(rs.getString("userid"));
  //         memberDTO.setPassword(rs.getString("password"));
  //         memberDTO.setName(rs.getString("name"));
  //         memberDTO.setEmail(rs.getString("email"));
  //       }
  //     } catch (SQLException e) {
  //       e.printStackTrace();
  //     } finally {
  //       close(con, pstmt, rs);
  //     }
  //     return memberDTO;
  //   }

  public List<MemberDTO> getRows() {
    // 전체 회원 조회
    List<MemberDTO> list = new ArrayList<>();

    con = getConnection();

    String sql = "SELECT * ";
    sql += "FROM MEMBERTBL";

    try {
      pstmt = con.prepareStatement(sql);

      rs = pstmt.executeQuery();

      while (rs.next()) {
        MemberDTO mDto = new MemberDTO();
        mDto.setUserId(rs.getString("userid"));
        mDto.setPassword(rs.getString("password"));
        mDto.setName(rs.getString("name"));
        mDto.setEmail(rs.getString("email"));

        list.add(mDto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }

    return list;
  }

  public int update(String userId, String password) {
    String sql = "UPDATE MEMBERTBL SET PASSWORD =? WHERE USERID =?";
    int result = 0;

    con = getConnection();

    try {
      pstmt = con.prepareStatement(sql);

      pstmt.setString(1, password);
      pstmt.setString(2, userId);

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public int delete(String userId) {
    String sql = "DELETE FROM MEMBERTBL WHERE userid =?";
    int result = 0;

    con = getConnection();

    try {
      pstmt = con.prepareStatement(sql);

      pstmt.setString(1, userId);

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }
}
