package lambda;

/**
 * 함수형 인터페이스
 *  - 람다식을 포함 할수있다 (추상 메소드는 하나만 사용가능하다, 일반적인 인터페이스와 다른점)
 *  - 메소드 한개만 사용하는 인터페이스 라면 함수형 인터페이스로 만들수있다
 *  - 람다식 == 익명 클래스 객체
 *  - 사용법 => 1. @FunctionalInterface(메소드 1개만 있다면 생략가능,그냥 명시용)  2.(빨간줄 해결) void method(); 넣기
 */

@FunctionalInterface
public interface MyFunction3 {
  int method(int x, int y);
}
