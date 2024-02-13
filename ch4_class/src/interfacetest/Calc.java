package interfacetest;

public interface Calc {
  // public static final 이 기본으로 붙어있다
  double PI = 3.14;
  int ERROR = -99999999;

  // public abstract 기본으로 붙어있다
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);
}
