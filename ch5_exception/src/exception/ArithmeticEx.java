package exception;

// 런타임 exception
// ArithmeticException : / by zero

public class ArithmeticEx {

  public static void main(String[] args) {
    int numer = 100;
    int result = 0;

    for (int i = 0; i < 10; i++) {
      try {
        result = numer / (int) (Math.random() * 10);
        System.out.println(result);
      } catch (ArithmeticException e) {
        System.out.println("예외");
      }
    }
  }
}
