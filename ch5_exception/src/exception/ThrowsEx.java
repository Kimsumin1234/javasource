package exception;

// Exception (예외)
// 1) 컴파일 예외(CheckedException)
//    컴파일 시에 발생하는 예외(컴파일러가 바로 알려줌,빨간줄) : 퀵픽스 로 바로 해결 할수있음
// 2) 런타임 예외
//    실행(Run) 시에 발생하는 예외(ArrayIndexOutOfBoundsException, ClassCastException, NullPointerException, ArithmeticException ...)
// 3) 논리적 예외
//    실행은 되나, 의도와는 다르게 동작 하는 경우 : 코딩을 다시 하면된다

// 예외 핸들링
// 1) try ~ catch 구문 사용
// 2) throws : 예외를 메소드에 선언하는 방법 : 해당 메소드를 호출하는 측에 Exception 이 전달됨
//    public static void method2() throws Exception {}

public class ThrowsEx {

  // main -> method1(); 호출 -> method1()이 main에 Exception 전달 -> main도 Exception 전달
  public static void main(String[] args) throws Exception {
    method1();
  }

  public static void method1() throws Exception {
    method2();
  }

  public static void method2() throws Exception {
    throw new Exception();
  }
}
