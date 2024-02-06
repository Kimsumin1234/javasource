package ch4;

public class CardEx {

  public static void main(String[] args) {
    // card1 에는 메모리주소값이 저장 그 주소는 heap에 하트,2번이 저장된곳을 가르킨다

    Card card1 = new Card("heart", 2);

    Card card2 = new Card("spade", 5);

    // static 변수를 호출할려면 클래스명을 지정한다
    // static 변수는 heap에 저장 안되고 static만 따로 저장되는 곳이있다
    // 카드크기 조회
    System.out.println("카드크기 : " + Card.width);
    System.out.println("카드크기 : " + Card.height);
    // System.out.println("카드크기 : " + card2.width);
    // System.out.println("카드크기 : " + card2.height);

    // 공유값 변경
    Card.width = 80;
    Card.height = 50;

    // static 에서 non-static 메소드, 변수 호출 불가
    // 호출이 가능하려면?
    // 1) 같은 static 으로 만들기
    // 2) 인스턴스 생성 후 접근하기
    // main이 static 이기 때문에
    CardEx obj = new CardEx();
    obj.method1();
  }

  public void method1() {
    System.out.println("인스턴스 메소드");
  }
}
