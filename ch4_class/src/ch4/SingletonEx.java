package ch4;

public class SingletonEx {

  public static void main(String[] args) {
    // Singleton singleton = new Singleton(); // not visible
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton == singleton2); // true, 싱글톤 패턴이기 때문에 트루가 나온다(같은 heap을 가르킨다)
  }
}
