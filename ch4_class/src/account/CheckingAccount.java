package account;

// 은행기능 + 체크카드기능

public class CheckingAccount extends Account {

  private String cardNo;

  public CheckingAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo
  ) {
    super(accountNo, owner, balance);
    this.cardNo = cardNo;
  }

  // pay(String cardNo, int amount)
  // cardNo 가 일치하는지 확인, 사용금액이 잔액보다 적은지 확인
  // 일치하지 않으면 "지불불가"
  // 일치하고, 금액이 작으면 잔액-사용금액

  void pay(String cardNo, int amount) throws Exception {
    if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
      throw new Exception("지불불가"); // 이걸 리턴하고 종료시키는 구문
    }
    // 잔액 = 잔액 - 사용액
    // setBalance(getBalance() - amount); 이걸 써도 되고
    withdraw(amount); // 수퍼 클래스가 가지고 있는걸 써도 된다
  }
}
