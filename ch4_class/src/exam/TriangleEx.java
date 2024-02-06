package exam;

public class TriangleEx {

  public static void main(String[] args) {
    Triangle triangle = new Triangle(10, 5);
    //
    double result = triangle.getArea();
    System.out.println("삼각형 넓이 : " + result);
    //
    System.out.println("삼각형 넓이 : " + triangle.getArea());
  }
}
