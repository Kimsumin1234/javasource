package ch4;

public class MyMath {

  private long num1, num2;

  public MyMath(long num1, long num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  long add() {
    return num1 + num2;
  }

  long subtract() {
    return num1 - num2;
  }

  long multiply() {
    return num1 * num2;
  }

  long divide() {
    return num1 / num2;
  }

  // Duplicate method add() : 메소드 중복 오류, 괄호안이 같아서
  static long add(long num1, long num2) {
    return num1 + num2;
  }

  static long subtract(long num1, long num2) {
    return num1 - num2;
  }

  static long multiply(long num1, long num2) {
    return num1 * num2;
  }

  static long divide(long num1, long num2) {
    return num1 / num2;
  }
}
