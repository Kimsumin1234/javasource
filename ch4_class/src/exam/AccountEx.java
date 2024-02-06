package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("110-11-222", "홍길동", 100000);
    // 에금 인출
    System.out.println("출금 잔액 : " + account.withdraw(50000));
    // 예금 입금
    int balance = account.deposit(1500000);
    System.out.println("현재 잔액 : " + balance);
  }
}
