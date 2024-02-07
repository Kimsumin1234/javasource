package ch4;

public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {} // private 걸린 생성자는 외부에서 사용불가

  static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }
}
