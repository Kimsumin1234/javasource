package exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)
  private String accountNum;
  private String name;
  private int money;

  // 생성자 생성
  public Account() {}

  public Account(String accountNum, String name, int money) {
    this.accountNum = accountNum;
    this.name = name;
    this.money = money;
  }
}
