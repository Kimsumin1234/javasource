package interfacetest;

// interface
// 모든 멤버 변수는 public static final
// 모든 멤버 메소드는 public abstract 임 (abstract 생략가능)
// 추상화가 높은 상태(완전 기본 설계도 상태 밑그림 정도, 나머지는 미완성)
// body 를 가진 메소드는 static,default 만 가능(1.8 버전 추가)
// 여러 개 구현 가능
// public class Bounus implements Account, CheckingAccount  가능
// public class Bounus extends CreditLine implements Account, CheckingAccount  가능

public interface Account {
  // accountNo; only public, static & final
  // private String accountNo; 멤버변수 선언 불가

  public static final int SPADE = 4; // 상수만 가능, 변수 x

  // Abstract methods do not specify a body
  // 추상메소드 사용
  public void deposit();

  // 앞에 static,default 이 붙는 메소드일 경우 {} 사용가능
  static void getCardKind() {}

  default void getCard() {}
}
