package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * 메소드 참조
 *  - 람다식을 더욱 간결하게 사용
 *  - 람다식이 하나의 메소드만 호출하는 경우 사용
 *
 * 형태
 *  - 클래스이름::메소드명;
 *  - 클래스이름::new;  객체생성
 */
public class LambdaEx6 {

  public static void main(String[] args) {
    // "5698" ==> 5698 + 30 ==>5728 리턴 (1개가 들어와서 1개가 리턴됨)
    // Function<String, Integer> f2 = s1 -> Integer.parseInt(s1);
    // 더욱 간결하게 사용 (어차피 s1 한개만 대입하면 되기 때문에)
    Function<String, Integer> f2 = Integer::parseInt;

    // 두개의 문자열을 받아서 문자열이 동일한지 리턴
    // BiFunction<String, String, Boolean> f1 = (s1, s2) -> s1.equals(s2);
    // String::equals; : String 에 있는 equals 사용해줘
    BiFunction<String, String, Boolean> f1 = String::equals;

    // Supplier<Student> s = () -> new Student();
    Supplier<Student> s = Student::new;
  }
}
