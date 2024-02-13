package abstractclass;

public abstract class Car {

  String color;
  int door;

  // 자식 클래스들 모두 다르게 구현할려고 하기때문에 추상메소드를 사용
  abstract void drive();

  void stop() {
    System.out.println("stop!!!");
  }
}
