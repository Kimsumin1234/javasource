package interfacetest;

public class DataEx {

  public static void main(String[] args) {
    // DataAccessObject obj = new Oracle();
    // dbWork(obj);
    // obj = new MySql();
    // dbWork(obj);
    dbWork(new Oracle()); // 줄이면 이렇게 표현
    dbWork(new MySql());

    // 익명(anonymous) 클래스 : 일회용 클래스(선언과 생성 동시에)
    DataAccessObject object = new DataAccessObject() {
      @Override
      public void select() {
        System.out.println("PostgreSQL 검색");
      }

      @Override
      public void insert() {}

      @Override
      public void update() {}

      @Override
      public void delete() {}
    };

    dbWork(object);
  }

  public static void dbWork(DataAccessObject dao) {
    // 오버라이딩된 메소드 여야 이렇게 사용할수 있다
    dao.select(); // Oracle DB 에서 검색 or MySql DB 에서 검색
    dao.insert(); // Oracle DB 에서 삽입 or MySql DB 에서 삽입
    dao.update(); // Oracle DB 에서 수정 or MySql DB 에서 수정
    dao.delete(); // Oracle DB 에서 삭제 or MySql DB 에서 삭제
  }
}
