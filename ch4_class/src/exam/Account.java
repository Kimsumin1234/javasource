package exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)
  private String accountNum;
  private String name;
  private int balance;

  // 생성자 생성
  public Account() {}

  public Account(String accountNum, String name, int balance) {
    this.accountNum = accountNum;
    this.name = name;
    this.balance = balance;
  }

  // 예금하다 메소드
  // deposit
  int deposit(int amount) {
    // balance += amount;
    // return balance;
    return balance += amount;
  }

  // 출금하다 메소드
  // withdraw
  int withdraw(int amount) {
    balance -= amount;
    return balance;
  }
}
