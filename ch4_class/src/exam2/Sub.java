package exam2;

public class Sub extends Calc {

  @Override
  int calculate() {
    return getA() - getB();
  }
}
