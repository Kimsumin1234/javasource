package exception;

// 고의로 예외 발생 시키기
// 예시) Account 할떄 "잔액이 부족합니다"
// throw

public class ThrowEx {

  public static void main(String[] args) {
    try {
      throw new Exception("고의로 발생시킨 에러");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
