package interfacetest;

public class AccountEx {

  public static void main(String[] args) {
    // 인스턴스 생성 불가
    // Cannot instantiate, 추상 클래스와 비슷한 경우
    // Account account = new Account();

    Account account = new CheckingAccount();
  }
}
