package interfacetest;

public abstract class Calculator implements Calc {

  // abstract 붙이면 Calc 의 추상메소드 를 그대로 상속 받아서 에러메세지 가 안뜬다
  // times 와 divide 만 여전히 추상메소드 인 상태

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }
}
