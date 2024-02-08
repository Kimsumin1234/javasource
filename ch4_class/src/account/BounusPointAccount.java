package account;

// 은행 : Account

// 은행 + 체크카드 : CheckingAccount

// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount

// 은행 + 마이너스 통장 : CreditLineAccount

// 은행 + 보너스 포인트 (예금액의 0.1% 포인트 제공)

public class BounusPointAccount extends Account {

  // 보너스 포인트 멤버변수
  private int bonusPoint;

  // 생성자
  public BounusPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bonusPoint
  ) {
    super(accountNo, owner, balance);
    this.bonusPoint = bonusPoint;
  }

  // 예금하다 오버라이딩
  @Override
  public void deposit(int amount) {
    // 에금 + 보너스포인트 적립
    super.deposit(amount);
    this.bonusPoint += (int) (amount * 0.001);
  }

  public int getBonusPoint() {
    return bonusPoint;
  }
}
