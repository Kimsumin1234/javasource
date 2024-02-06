package ch4;

public class Student2 {

  // 현실 데이터를 자바로 넣기위해서 class를 생성해야한다

  // 이렇게 만든 클래스는 run 을 할수없다
  // main이 없는 클래스로 틀만 만든다
  // 맴버변수 (= 인스턴스 변수, property, 속성, 필드) - 학생 객체가 가져야 하는 특징
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구), 주민번호(071215-2011237), 핸드폰(010-1234-1234)
  private String id; // 학번 저장
  private String name; // 이름 저장
  private String addr; // 주소 저장
  private String hp; // 핸드폰 저장 (중간에 - 들어가는거는 대부분 String 이다)

  // 맴버메소드 (= 인스턴스 메소드, 기능, 동작)
  // 속성을 변경시킬수 있도록 메소드 작성
  // 메소드(=함수) 작성 규칙
  // 리턴타입 메소드명(){}
  // return type(타입) : 정수형, 실수형, 논리형, 문자형, String, 배열, void
  void changeAddr(String addr) {
    // 멤버변수 addr 의 값을 변경
    this.addr = addr;
    // 리턴 값은 없음 (=void)
  }

  void changeHp(String hp) {
    this.hp = hp;
  }

  // 생성자 (constructor) - 멤버변수 초기화가 목적이다 (초기화를 안하면 기본값으로 출력되기 때문에)
  // 클래스를 객체로 생성할 때 필수로 필요
  Student2() {} // 클래스 이름하고 동일하다

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  // 생성자는 여러개 들어올수있다. 단,()안에는 달라야함 ()안에 변수 순서만 바꾼다고 다른건 아니다, 생성자 오버로딩
  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public String getHp() {
    return hp;
  }

  public void setHp(String hp) {
    this.hp = hp;
  }
}
