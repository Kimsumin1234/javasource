package generics;

/**
 * Generics (지네릭스)
 *  - 다양한 타입의 객체들을 다루는 메소드나 컬렉션 클래스 컴파일 시 타입체크를 해주는 기능
 *  - 데이터를 담기 시작할때 부터 타입을 정해놔서 꺼낼때 타입체크를 용이하게함
 *  - 장점 : 1. 타입 안정성 제공 / 2. 타입체크와 형변환 생략 가능하므로 코드 간결
 */
public class Box {

  /*
   * Object item; : Object 로 선언시 아무거나 다 담을수있다
   */
  private Object item;

  public Object getItem() {
    return item;
  }

  public void setItem(Object item) {
    this.item = item;
  }
}
