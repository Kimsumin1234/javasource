package lang;

// java.lang.String : 문자열 클래스
// - 변경 불가능(immutable)한 클래스 : 읽기만 가능

public class StringEx1 {

  public static void main(String[] args) {
    // 인스턴스 생성
    // 두 방법이 각각 저장방식이 다르다
    String str = new String("abc"); // heap 에 따로 abc 가 저장됨
    String str2 = "abc"; // 리터럴에 abc 저장
    String str3 = "abc"; // 리터럴에 abc 가 있는지 찾아보고 있으면 abc 를 가르킴
    System.out.println(str2 == str3 ? "같음" : "다름"); // 같음
    System.out.println(str2 == str ? "같음" : "다름"); // 다름

    // String 클래스도 equals() 가 오버라이딩 되있다 : 값 비교
    // 문자열 비교는 == 보다는 equals() 를 사용 (equals()가 값비교로 오버라이딩 되있는 클래스 일수 있으니까)
    System.out.println(str2.equals(str3) ? "같음" : "다름"); // 같음
    System.out.println(str2.equals(str) ? "같음" : "다름"); // 같음

    // - 변경 불가능(immutable)한 클래스 : 읽기만 가능
    // 변수 a 가 원본"a"값을 가르키는데 원본"a" 가 "ab"로 변경되지 않고, 원본"ab"값을 새로 하나 더 만든다
    String a = "a";
    String b = "b";
    a = a + b; // 문자열 결합횟수가 많다면 효율성이 떨어질 수 있음 => StringBuffer, StringBuilder 클래스 사용
    System.out.println(a);
  }
}
