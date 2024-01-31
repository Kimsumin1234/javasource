package operator;

// 산술연산자 : +, -, *, /, %(나머지 값)
public class ArithmeticEx2 {

  public static void main(String[] args) {
    // int apple = 1;
    // double pieceUnit = 0.1d;
    // int number = 7;
    // double result = apple - number * pieceUnit; // 실수형 계산시 0.3이 정확하게 출력을 못함

    int apple = 1;
    int totalPieces = apple * 10;
    int number = 7;
    int temp = totalPieces - number;
    double result = temp / 10.0; // 정수로 계산해야 0.3이 나온다

    System.out.println(result);

    // 런타임 예외사항 (실행을 시켰더니 에러가 발생한 상황)
    // Exception in thread "main" java.lang.ArithmeticException(산술연산관련): / by zero(0 때문이다,이유도 나오는 경우)
    System.out.println(10 / 0);
  }
}
