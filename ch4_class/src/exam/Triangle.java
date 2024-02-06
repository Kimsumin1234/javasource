package exam;

public class Triangle {

  // 밑변(bassLine), 높이(height)
  private int bassLine;
  private int height;

  // 생성자 - default,2개 선택
  public Triangle() {}

  public Triangle(int bassLine, int height) {
    this.bassLine = bassLine;
    this.height = height;
  }

  // 메소드 생성 getArea()
  // 밑변 * 높이 / 2
  double getArea() {
    return bassLine * (double) height / 2;
  }
}
