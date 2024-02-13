package abstractclass;

// 추상 클래스 (abstract class)
// 미완성 설계도 => 자식 클래스에서 완성하는 개념
// 무조건 추상 메소드가 존재
// 인스턴스 생성 불가
// 설계 단계에서 추상클래스를 사용할지 오버라이딩을 사용할지 결정

// 클래스 : 완성 설계도

public abstract class Account {

  // 멤버 변수
  private String accountNo;

  // 생성자
  public Account() {}

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  // 멤버 메소드
  public void deposit() {}

  // 추상 메소드 : {} 없음, 미완성 상태
  public abstract void print();
}
