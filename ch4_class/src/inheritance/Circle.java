package inheritance;

// 원(Circle)은 점(Point)이다 => Circle is a Point
// 원(Circle)은 점(Point)을 가지고 있다 => Circle has a Point

// 상속관계 (isa)
// public class Circle extends Point {

//   //   int x; // 원점의 x좌표
//   //   int y; // 원점의 y좌표
//   int r; // 반지름
// }

// 포함관계 (hasa) : 한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를 선언
public class Circle {

  Point p = new Point(); // Point p => 일종의 멤버변수, 멤버변수 선언하면서 객체생성, 참조형 형태로 들어오면 포함관계라고 생각하면된다
  int r;
}
