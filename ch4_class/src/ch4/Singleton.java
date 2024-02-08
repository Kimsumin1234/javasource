package ch4;

// Singleton 패턴
// 단 하나의 객체만을 생성할 수 있도록 하는 패턴
// 여러개의 객체를 만들지 못하게함

public class Singleton {

  private static Singleton singleton;

  private Singleton() {} // private 걸린 생성자는 외부에서 사용불가

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
