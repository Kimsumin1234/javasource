package lang;

// java.lang.Math : 기본적인 수학 계산에 유용한 메소드로 구성된 클래스
// static 메소드, 변수 : 클래스이름.메소드, 클래스이름.변수 로 그냥 사용하면된다
//       static final : 상수

public class MathEx {

  public static void main(String[] args) {
    System.out.println(Math.PI);

    // Math.random() : 0 ~ 1미만의 임의의 숫자
    System.out.println(Math.random());
  }
}
