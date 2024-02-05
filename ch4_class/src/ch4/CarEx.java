package ch4;

public class CarEx {

  public static void main(String[] args) {
    // 객체 생성하기 ==> 클래스를 사용 할수 있는 상태로 만드는 개념
    Car car = new Car();
    car.company = "현대";
    car.model = "소나타";
    car.maxSpeed = 180;
    car.forward();

    Car car2 = new Car();
    car2.company = "현대";
    car2.model = "아반떼";
    car2.maxSpeed = 190;
    car2.backward();
  }
}
