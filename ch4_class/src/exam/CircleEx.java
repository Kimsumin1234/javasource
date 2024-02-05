package exam;

public class CircleEx {

  public static void main(String[] args) {
    // Circle 객체 생성
    Circle circle = new Circle(3.5);
    // circle.radius=3.5; (private 이 걸려있어서 이렇게 안됨)

    // 원의 면적 구하는 메소드를 호출
    // return 나를 호출한 곳으로 다시 돌아간다
    // 원의 면적 구하는 메소드를 만들어 놓으면 다양한 면적의 원들의 객체를 만들수있다
    double result = circle.getArea();
    System.out.println("원의 면적 : " + result);
  }
}
