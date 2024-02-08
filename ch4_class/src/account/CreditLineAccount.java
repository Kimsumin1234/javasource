package account;

// 은행 : Account

// 은행 + 체크카드 : CheckingAccount

// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount

// 은행 + 마이너스 통장
public class CreditLineAccount extends Account {

  private int creditLine; // 마이너스 한도

  public CreditLineAccount(
    String accountNo,
    String owner,
    int balance,
    int creditLine
  ) {
    super(accountNo, owner, balance);
    this.creditLine = creditLine;
  }

  // 마이너스 통장 : 잔액 = 잔액 + 마이너스 한도
  @Override
  public void withdraw(int amount) throws Exception {
    if (getBalance() + creditLine < amount) throw new Exception("인출 불가");
    super.setBalance(super.getBalance() + creditLine);

    super.withdraw(amount);
  }
}
