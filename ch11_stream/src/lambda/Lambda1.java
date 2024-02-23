package lambda;

/**
 * 람다식 (Lambda Expression)
 *  - 메소드(다른데서는 함수라고 하기도함)를 하나의 식으로 표현한 것
 *  - 함수형 인터페이스를 써야 사용가능하다
 *
 * 일반적인 메소드 형태 - 반환타입 메소드명(매개변수) { }
 * 람다식 메소드 형태 - (매개변수) -> { }
 */
public class Lambda1 {

  // 메소드 선언 방식 (기본)
  int max(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }

  // 메소드 선언 방식 (람다식)
  // 좀더 코드를 간단하게 사용할수 있지 않을까 해서 요즘에 사용하는 추세
  // (int num1, int num2) -> { return num1 > num2 ? num1 : num2; }
  // (int num1, int num2) -> num1 > num2 ? num1 : num2; 실행할 구문이 한개라면 중괄호 생략 가능
  // (num1, num2)-> num1 -> num2 ? num1 : num2;  가장 간단한 형태

  void print(String name, int i) {
    System.out.println(name + "=" + i);
  }

  // (String name, int i) -> System.out.println(name + "=" + i);
  // (name,  i) -> System.out.println(name + "=" + i);

  int square(int x) {
    return x * x;
  }

  // (int x) -> {return x * x;}
  // (x) ->  x * x;

  int roll() {
    return (int) (Math.random() * 6);
  }

  // () -> (int) (Math.random() * 6);

  int sumArr(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }
  //   (int[] arr) -> {
  //     int sum = 0;
  //     for (int i : arr) {
  //         sum += i;
  //       }
  //       return sum;
  //      }
}
