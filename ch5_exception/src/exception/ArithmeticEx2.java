package exception;

// 상속관계
// Object

// Throwable

// Exception
// RuntimeException, IOException

public class ArithmeticEx2 {

  public static void main(String[] args) {
    try {
      System.out.println(args[0]); // ArrayIndexOutOfBoundsException 여기서 Exception 이 발생하면 멈춘다 밑에구문(3/0)은 실행 안함, 해결한뒤 실행이됨
      System.out.println(3 / 0); // ArithmeticException : / by zero
    } catch (Exception e) {
      e.printStackTrace();
    }
    // catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
    //   e.printStackTrace();
    // }

    // catch (ArrayIndexOutOfBoundsException e) {
    //   e.printStackTrace();
    // } catch (ArithmeticException e) {
    //   e.printStackTrace();
    // }
  }
}
