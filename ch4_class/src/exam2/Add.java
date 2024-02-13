package exam2;

public class Add extends Calc {

  @Override
  int calculate() {
    return getA() + getB();
  }
}
