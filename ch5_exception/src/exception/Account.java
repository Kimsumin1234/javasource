package exception;

public class Account {

  private int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  // new Exception() : 컴파일 예외, 던지면 던진쪽에 빨간줄이 뜬다
  // new RuntimeException() : 런타임 예외

  public void withdraw(int money)
    throws RuntimeException, BalanceInsufficientException {
    if (balance < money) {
      throw new BalanceInsufficientException("잔액 부족");
    }
  }
}
