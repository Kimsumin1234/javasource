package exam;

public class Calc {

  // 멤버변수x 메소드만 있는 클래스
  // int 타입의 두 개의 변수를 받아서 덧셈 결과를 리턴
  int add(int num1, int num2) {
    return num1 + num2;
  }

  // int 타입의 두 개의 변수를 받아서 뺄샘 결과를 리턴
  int subtract(int num1, int num2) {
    return num1 - num2;
  }

  // int 타입의 두 개의 변수를 받아서 곱셈 결과를 리턴
  int multiply(int num1, int num2) {
    return num1 * num2;
  }

  // int 타입의 두 개의 변수를 받아서 나누셈 결과를 리턴
  int divide(int num1, int num2) {
    return num1 / num2;
  }
}
