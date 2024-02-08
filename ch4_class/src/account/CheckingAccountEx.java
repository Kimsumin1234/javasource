package account;

public class CheckingAccountEx {

  public static void main(String[] args) {
    CheckingAccount cAccount = new CheckingAccount(
      "220-11",
      "홍길동",
      100000,
      "111-11"
    );

    try {
      cAccount.pay("111-11", 50000);
      System.out.println("현재 잔액" + cAccount.getBalance());
    } catch (Exception e) {
      e.printStackTrace();
    }
    // 1) 체크카드 번호 동일
    CheckingTrafficCardAccount cTrafficCardAccount = new CheckingTrafficCardAccount(
      "220-11",
      "홍길동",
      1000000,
      "11-111",
      true
    );

    try {
      cTrafficCardAccount.payTrafficCard("11-111", 1800);
      System.out.println("현재잔액 : " + cTrafficCardAccount.getBalance());
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 2) 체크카드 번호 불일치
    // CheckingTrafficCardAccount cTrafficCardAccount2 = new CheckingTrafficCardAccount(
    //   "220-11",
    //   "홍길동",
    //   1000000,
    //   "2-3",
    //   true
    // );
    // try {
    //   cTrafficCardAccount2.payTrafficCard("2-2", 1000);
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }

    CreditLineAccount creditLineAccount = new CreditLineAccount(
      "110-15",
      "김호진",
      10000,
      5000000
    );
    try {
      creditLineAccount.withdraw(2500000);
      System.out.println(
        creditLineAccount.getOwner() +
        "현재 잔액 : " +
        creditLineAccount.getBalance()
      );
    } catch (Exception e) {
      e.printStackTrace();
    }

    BounusPointAccount bounusPointAccount = new BounusPointAccount(
      "110-12",
      "이순신",
      0,
      0
    );
    bounusPointAccount.deposit(100000);
    System.out.printf(
      "%s 님의 보너스 포인트는 %d\n",
      bounusPointAccount.getOwner(),
      bounusPointAccount.getBonusPoint()
    );
  }
}
