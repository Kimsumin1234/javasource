package ch4;

public class Person {

  // 멤버변수에 final이 붙은 경우
  // 초기화(선언 or 생성자) 반드시 해야 함
  // final 멤버변수는 수정불가 - 초기화를 계속 해줘야한다
  // final 멤버변수는 상수개념이다

  // 클래스에 final이 붙은 경우 - 상속금지
  // 메소드에 final이 붙은 경우 - 오버라이딩 금지

  private String name;
  private final String nation;

  // 객체끼리 공유하는 상수
  // 상수는 대문자로 표현(java의 경우)
  // private static final double PI = 3.141592;
  private static final double PI = 3.141592; // final 위치 무관

  public static double getPi() {
    return PI;
  }

  public Person(String name, String nation) {
    this.name = name;
    this.nation = nation;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // 우클릭 -> Source Action -> Generator toString
  @Override
  public String toString() {
    return "Person [name=" + name + "]";
  }
}
