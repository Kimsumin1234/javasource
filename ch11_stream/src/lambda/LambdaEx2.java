package lambda;

public class LambdaEx2 {

  public static void main(String[] args) {
    MyFunction4 lambda = () -> System.out.println("main run()");
    lambda.run();

    System.out.println();

    execute(getRun());
  }

  // lambda 리턴 한걸 매개변수로 받아서 lambda.run(); 호출
  static void execute(MyFunction4 lambda) {
    lambda.run();
  }

  // lambda 로 리턴
  static MyFunction4 getRun() {
    MyFunction4 lambda = () -> System.out.println("MyFunction4 !!!!!!");
    return lambda;
  }
}
