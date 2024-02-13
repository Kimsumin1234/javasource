package exam2;

public class Odd extends OddDetector {

  public Odd(int n) {
    super(n);
  }

  @Override
  boolean isOdd() {
    return getN() % 1 == 0.0;
  }
}
// n 멤버 변수 int 타입
// C 붙으면 생성자
// get
// A abs 추상 메소드
