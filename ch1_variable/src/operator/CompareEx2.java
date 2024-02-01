package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true or false 로 나옴
    // 문자 vs 문자열
    //  ''  vs  ""
    // 'A'  vs  "A"  (문자 하나라도 문자열 기호를 사용할수있다)

    String str1 = "홍길동"; // 타입을 대문자로 시작하면 객체타입이다
    String str2 = "홍길동";
    String str3 = new String("홍길동");
    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false

    // 문자열 비교는 equals() 사용
    System.out.println(str1.equals(str3)); // true
  }
}
