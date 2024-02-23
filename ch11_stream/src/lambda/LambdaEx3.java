package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 함수형 인터페이스를 만드는 작업도 생략 할수있게
 * 많이 쓰는 형태를 java 에서 만들어 놓음
 * 매개변수 타입과 반환값 타입을 T,E... 같은걸로 해놨다 => 객체타입으로 넣으면된다
 *
 * java.util.function 패키지
 *  - 함수형 인터페이스를 제공
 *
 * 메소드 유형
 *  1) 매개변수 없고, 반환값도 없음 : 예시) void run()  ==> java.lang.Runnable
 *  2) 매개변수 없고, 반환값 있음 : 예시) int run()  ==> Supplier<T> T get()
 *  3) 매개변수 있고, 반환값 없음 : 예시) void run(int a)  ==> Consumer<T> void accept(T t)
 *  4) 매개변수 있고, 반환값 있음 : 예시) int run(int a)  ==> Function<T,R> R apply(T t)
 *  5) 조건식 표현할때 사용되는 메소드 : 예시) boolean test(int a) : a가 홀수/짝수, a가 문사/숫자  ==> Predicate<T> boolean test(T t)
 *
 * Bi 로 시작
 *  6) 매개변수가 2개 : 예시) void run(int a, String str)  ==> BiConsumer<T,U> void accept(T t,U u)
 *                             int run(int a, float f)  ==> BiFunction<T,U,R> R apply(T t,U u)
 *                             boolean test(int a, double b)  ==> BiPredicate<T,U> boolean test(T t,U u)
 *
 * Function<T,R> 과 비슷한 역할
 * 매개변수 타입과 반환 타입이 모두 일치하는 경우
 *  - UnaryOperator<T> T apply(T t)
 *  - BinaryOperator<T> T apply(T t,T t)
 *
 * 기본형을 이용하는 함수형 인터페이스
 *  - ToIntFunction => int applyAsInt(T value) : 매개변수가 객체형태로 들어오면 int 로 리턴해준다
 *
 */
public class LambdaEx3 {

  public static void main(String[] args) {
    Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
    System.out.println("1~100 임의의 수 : " + s.get());

    Consumer<Integer> c = i -> System.out.println(i);
    c.accept(10);

    Function<Integer, Integer> f = i -> i / 10 * 10;
    System.out.println(f.apply(10));

    Predicate<Integer> p = i -> i % 2 == 0;
    System.out.println(p.test(10));

    // "5698" ==> 5698 + 30 ==>5728 리턴 (1개가 들어와서 1개가 리턴됨)
    Function<String, Integer> f2 = s1 -> Integer.parseInt(s1);
    System.out.println(f2.apply("5698") + 30);

    // 문자열의 길이가 0인지 판별
    Predicate<String> p2 = s2 -> s2.length() == 0;
    System.out.println(p2.test("문자열 길이 판별"));

    // 문자열 리턴
    Supplier<String> s3 = () -> "문자열 리턴";
    System.out.println(s3.get());

    // 문자열을 받아서 문자열 출력
    Consumer<String> consumer = str -> System.out.println(str);
    consumer.accept("문자열 출력");

    // 두개의 숫자를 받아서 더하기 한 후 리턴 (2개를 받아서 1개를 리턴)
    BiFunction<Integer, Integer, Integer> bifn = (x, y) -> x + y;
    System.out.println(bifn.apply(100, 200));

    // 두개의 숫자를 받아서 큰 값 출력하기
    BiConsumer<Integer, Integer> bicn = (num1, num2) ->
      System.out.println(num1 > num2 ? num1 : num2);
    bicn.accept(20, 50);

    // 두개의 String 을 받아서 하나의 문자열로 리턴
    BiFunction<String, String, String> bifn2 = (str1, str2) ->
      str1.concat(str2);
    System.out.println(bifn2.apply("Bi 연", "결 Function"));
  }
}
