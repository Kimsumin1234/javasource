package book;

// JdbcUtil.getConnection(); => getConnection(); 요렇게 사용할수 있다
import static book.JdbcUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ~DAO : 자바 와 데이터베이스를 연결하는 객체
 *        데이터베이스 담당 객체
 *
 * static{} : 클래스가 메모리에 처음 로딩될 때 한번만 수행
 */
public class BookDAO {

  private Connection con;
  private PreparedStatement pstmt;
  private ResultSet rs;

  // C(insert) R(select) U(update) D(delete)
  public int insert(BookDTO dto) {
    con = JdbcUtil.getConnection();
    int result = 0;
    String sql = "INSERT INTO BOOKTBL(code,title,writer,price) VALUES(?,?,?,?)";
    try {
      pstmt = con.prepareStatement(sql);
      // ? 처리
      // 1,2,3,4 : ? 순서
      pstmt.setInt(1, dto.getCode());
      pstmt.setString(2, dto.getTitle());
      pstmt.setString(3, dto.getWriter());
      pstmt.setInt(4, dto.getPrice());

      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public BookDTO getRow(int code) {
    // 하나만 조회
    // SQL 인젝션 : 네트워크 해킹 같은 공격
    // ? : SQL 인젝션 방지
    con = getConnection();
    String sql = "SELECT * FROM BOOKTBL WHERE CODE =?";
    BookDTO dto = null;
    try {
      pstmt = con.prepareStatement(sql);
      // ? 처리
      // setInt(1, code) : 1번 ? 처리해줘
      pstmt.setInt(1, code);
      // ~DTO : rs 에 있는 값을 담을 객체
      // BookDTO 에 담아서 BookMain 에 넘겨줘야함
      // DTO 와 DAO 끼리 서로 주고받는 관계
      rs = pstmt.executeQuery();
      // rs => BookDTO 옮겨담기
      // PK 일 경우 중복이 안나와서 하나만조회
      // rs.next() : 행 1개가 들어옴 -> rs.getInt("컬럼명") : 컬럼명 가져옴
      // 행 1개가 new BookDTO() 1개
      if (rs.next()) {
        // 방법 1
        // int code1 = rs.getInt("code");
        // String title = rs.getString("title");
        // String writer = rs.getString("writer");
        // int price = rs.getInt("price");

        // dto = new BookDTO();
        // dto.setCode(code1);
        // dto.setTitle(title);
        // dto.setWriter(writer);
        // dto.setPrice(price);

        // 방법 2
        dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return dto;
  }

  public List<BookDTO> getRows() {
    // 여러개 조회
    con = getConnection();
    String sql = "SELECT * FROM BOOKTBL";
    List<BookDTO> list = new ArrayList<>();

    try {
      pstmt = con.prepareStatement(sql);
      rs = pstmt.executeQuery();

      while (rs.next()) {
        // 행 하나 => BookDTO 로 생성
        BookDTO dto = new BookDTO();
        dto.setCode(rs.getInt("code"));
        dto.setTitle(rs.getString("title"));
        dto.setWriter(rs.getString("writer"));
        dto.setPrice(rs.getInt("price"));
        // BookDTO 를 list 에 추가
        list.add(dto);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt, rs);
    }
    return list;
  }

  public int update(BookDTO dto) {
    con = getConnection();
    int result = 0;

    String sql = "UPDATE BOOKTBL SET PRICE = ? WHERE CODE = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, dto.getPrice());
      pstmt.setInt(2, dto.getCode());
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }

  public int delete(int code) {
    con = getConnection();
    int result = 0;

    String sql = "DELETE FROM BOOKTBL WHERE CODE = ?";
    try {
      pstmt = con.prepareStatement(sql);
      pstmt.setInt(1, code);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      close(con, pstmt);
    }

    return result;
  }
}
