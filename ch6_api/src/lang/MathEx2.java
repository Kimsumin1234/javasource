package lang;

import static java.lang.Math.*;

// Math 클래스 : 구성 요소가 모두 static 상태이면
// import static java.lang.Math.*; 직접 import static 을 사용해서 Math. 을 생략하고 바로 사용할수있다

public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(PI);

    // Math.random() : 0 ~ 1미만의 임의의 숫자
    System.out.println(random());

    // round() : 반올림
    double val = 90.7552;
    System.out.println("round() : " + round(val));
  }
}
