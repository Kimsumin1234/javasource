package ch4;

public class Calc {

  // 직사각형, 정사각형 넓이
  // 할려고 하는 목적은 동일하지만 방법이 다를경우 오버로딩을 사용한다
  double areaRectangle(double width) {
    // 정사각형
    return width * width;
  }

  double areaRectangle(double width, double height) {
    // 직사각형
    return width * height;
  }
}
