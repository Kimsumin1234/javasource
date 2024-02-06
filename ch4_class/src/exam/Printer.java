package exam;

public class Printer {

  // println 출력문도 메소드 오버로딩이 어딘가에 되어있다

  void println(int num) {
    System.out.println(num);
  }

  void println(boolean bool) {
    System.out.println(bool);
  }

  void println(double num) {
    System.out.println(num);
  }

  void println(String name) {
    System.out.println(name);
  }
}
