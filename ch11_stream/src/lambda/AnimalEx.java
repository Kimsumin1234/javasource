package lambda;

public class AnimalEx {

  public static void main(String[] args) {
    // 일반적인 인터페이스 활용 방법
    Animal animal = new Lion();
    animal.eat();

    /**
     * 람다식 인터페이스 활용 방법
     * 어차피 사용하는 메소드가 1개라면
     * 귀찮게 구현클래스 만드는 작업을 하지 않아도된다
     */
    Animal animal2 = () -> System.out.println("풀을 먹는다");
    animal2.eat();
  }
}
