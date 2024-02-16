package lang;

// 기본형(int...) 값들을 객체로 저장하거나 사용할때가 있음
// 객체로 선언해주면 => .메소드 들을 사용할수있다
// Wrapper 클래스
// java.lang.Byte ==> byte 의 객체
// java.lang.Short ==> short 의 객체
// java.lang.Character ==> char 의 객체
// java.lang.Integer ==> int 의 객체
// java.lang.Long ==> long 의 객체
// java.lang.Float ==> float 의 객체
// java.lang.Double ==> double 의 객체
// java.lang.Boolean ==> boolean 의 객체

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10;

    // Integer 객체 사용하는 방법
    Integer i2 = 10; // new Integer 는 이버전에서 지원 x, 자동형변환 해줌
    Integer i3 = Integer.valueOf(20); // new Integer 는 이버전에서 지원 x, 원래방법

    // intValue() : Integer -> int (객체를 기본형으로 바꿈)
    int result = i2.intValue(); // 원래방법
    int result2 = i2; // 자동형변환 해줌
  }
}
