package exception;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(100000);

    // Account 에서 throws 로 예외를 던진걸 AccountEx 가 try catch 로 받아서 사용자가 낸 예외를 대처하는 방법
    try {
      account.withdraw(200000);
    } catch (Exception e) {
      // System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
