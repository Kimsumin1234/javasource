package ch4;

public class MemberCall {

  int iv = 10; // 인스턴스 변수
  static int cv = 20; // 클래스 변수

  // static reference to the non-static field (static은 static을 선호한다, 거의 static은 static 끼리만 사용한다)
  // 클래스 메소드
  static void staticMethod1() {
    // System.out.println(iv); 아직 인스턴스 변수가 올라오지않음
    System.out.println(cv);
  }

  void instanceMethod1() {
    System.out.println(iv);
    System.out.println(cv);
  }
}
