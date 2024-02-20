package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Exception 런타임 에러
 * 1. forName 틀림 : ClassNotFoundException: orcle.jdbc.OracleDriver
 * 2. url 틀림 : SQLException: ORA-17067: 부적합한 Oracle URL이 지정되었습니다
 * 3. user,password 틀림 : SQLException: ORA-01017: 사용자명/비밀번호가 부적합, 로그온할 수 없습니다.
 * 4. DAO 에 sql 구문 틀림 : SQLSyntaxErrorException: ORA-00933: SQL 명령어가 올바르게 종료되지 않았습니다
 * 5. ? 부분이 틀림 : SQLException: ORA-17003: 열 인덱스가 부적합합니다.
 */

public class JdbcUtil {
  static {
    try {
      Class.forName("oracle.jdbc.OracleDriver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() {
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "c##test2";
    String password = "test";

    try {
      return DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void close(Connection con, PreparedStatement pstmt) {
    try {
      if (pstmt != null) pstmt.close();
      if (con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void close(
    Connection con,
    PreparedStatement pstmt,
    ResultSet rs
  ) {
    try {
      if (rs != null) rs.close();
      if (pstmt != null) pstmt.close();
      if (con != null) con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
