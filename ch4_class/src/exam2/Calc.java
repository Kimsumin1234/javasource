package exam2;

public abstract class Calc {

  int a, b;

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  abstract int calculate();
}
