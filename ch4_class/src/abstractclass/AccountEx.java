package abstractclass;

public class AccountEx {

  public static void main(String[] args) {
    // Cannot instantiate : 인스턴스 생성 불가
    // Account account = new Account();

    // 추상클래스 인스턴스 생성 방법 (왼쪽부모=오른쪽자식 형태)
    // 자식이 있어야 생성가능
    Account account = new CheckingAccount();
  }
}
