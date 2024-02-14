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
// 2) throws : 예외를 메소드에 선언하는 방법
//    void main(String[] args) throws ClassNotFoundException {}

public class CheckedException {

  public static void main(String[] args) throws ClassNotFoundException {
    // try {
    //   // try : exception 이 발생 할 수 있는 구문 넣기
    //   Class.forName("java.lang.String2");
    // } catch (ClassNotFoundException e) { // 클래스 이름을 찾지 못할경우 ClassNotFoundException 이게 나온다
    //   // catch : Exception 나올경우 어떻게 할건지 구문 넣기
    //   //   e.printStackTrace(); // 개발할 때 주로 사용, 어디서 Exception 나오는지 확인용
    //   //   System.out.println(e.getMessage());
    //   System.out.println("해당하는 클래스는 없습니다."); // 사용자가 보기 편하게 메세지 만들기
    // }

    Class.forName("java.lang.String2");
  }

  public static void method1() {}

  public static void method2() {}
}
