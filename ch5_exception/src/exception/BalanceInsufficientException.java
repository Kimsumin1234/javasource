package exception;

// 사용자 정의 예외 : 개발자가 직접 예외 클래스 만드는 경우
// Exception 클래스 가 자바에 기본 탑제 되있기 때문에 상속받아서 예외 이름을 지정 할수있다
public class BalanceInsufficientException extends Exception {

  public BalanceInsufficientException() {
    super();
  }

  public BalanceInsufficientException(String message) {
    super(message);
  }
}
