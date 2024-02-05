package ch4;

public class StudentEx2 {

  public static void main(String[] args) {
    // Student2 객체 생성
    // 객체 생성할때 () 하고 ("20231423",...) 이런 방법이 있다
    // new Student2("20231423",...) 이 객체는 Student2 클래스에서  Student2(String id, String name, String addr, String hp){this.} 이부분이랑 관련있게됨
    // new 라는 구문은 무조건 생성자를 호출(사용)한다
    Student2 obj = new Student2(
      "20231423",
      "김철수",
      "서울시 구로구",
      "010-4567-1234"
    );
    System.out.println(obj);
    // 김철수 주소변경 --> Student2 클래스에서 메소드 작업
    obj.changeAddr("서울시 중량구");
    // 주소변경 확인
    System.out.println(obj);

    // 김철수 핸드폰 변경 --> Student2 클래스에서 메소드 작업
    obj.changeHp("010-6987-7890");
    // 핸드폰 변경 확인
    System.out.println(obj);

    Student2 obj2 = new Student2(); // 이 객체는 Student2 클래스에서  Student2(){} 이 부분이랑 관련있게됨
    System.out.println(obj2);
    // 직접접근 불가 (Student2 클래스에서 private 지정해놔서)
    // obj.id="20231423";  (is not visible)

    Student2 obj3 = new Student2("20245812", "김진수", "경기도 수원시");
    System.out.println(obj3);
  }
}
