package lang;

import java.util.Date;

public class StringEx2 {

  public static void main(String[] args) {
    // 생성자
    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    // 메소드
    // return type => 변수담기 or sout (void가 아닐경우)

    // charAt() : 인덱스 위치 문자 반환
    char ch = str1.charAt(0);
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // concat() : 문자열을 뒤에 연결
    String result = str1.concat(" World");
    System.out.println("concat : " + result);

    // compareTo() : 0, -1, 1 을 리턴
    // 문자열을 사전 순서로 비교 (abcd..., ㄱㄴㄷ...)
    // 같으면 0, 사전순으로 이전이면 음수, 이후면 양수
    // a = 97, b = 98
    // 앞에열 부터 비교한다 bbb - baa => 첫번째 b-b 같으면 => 2번째 b-a 비교
    System.out.println("compareTo() : " + str1.compareTo(str3));
    System.out.println("compareTo() : " + "aaa".compareTo("bbb"));
    System.out.println("compareTo() : " + "bbb".compareTo("aaa"));
    System.out.println("compareTo() : " + "bbb".compareTo("baa"));

    // contains() : 지정된 문자열이 포함되었는지 검사
    System.out.println("contains() : " + str1.contains("e"));

    // endsWith() : 지정된 문자열로 끝나는지 검사
    System.out.println("endsWith() : " + str3.endsWith("t"));
    System.out.println("endsWith() : " + "Hello.txt".endsWith("txt")); // 파일 확장명 서치 가능

    // startsWith() : 지정된 문자열로 시작하는지 검사
    System.out.println("startsWith : " + str3.startsWith("H"));

    // equals() / equalsIgnoreCase()
    // Hello == HELLO 같으냐 : 문자는 대소문자 구별함
    // equalsIgnoreCase() : 대소문자 구별하지 말고 비교
    System.out.println(
      "equalsIgnoreCase() : " + str1.equalsIgnoreCase("HELLO")
    );
    System.out.println("equals() : " + str1.equals("HELLO"));

    // indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치 반환
    //             있으면 해당 위치를 반환, 없으면 -1
    //             왼쪽부터 서치
    // contains() 와 비슷한 역할, 인덱스 숫자가 필요하면 indexOf() 사용
    System.out.println("indexOf() : " + str1.indexOf("s"));
    System.out.println("indexOf() : " + str1.indexOf('s'));
    System.out.println("indexOf() : " + str1.indexOf('e'));
    // 2번을 시작위치로 지정 (기본은 0)
    System.out.println("indexOf() : " + str1.indexOf('e', 2));

    // lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 찾아서 위치 반환
    String str4 = "java.lang.String";
    System.out.println("lastIndexOf() : " + str4.lastIndexOf("."));
    System.out.println("indexOf() : " + str4.indexOf("."));

    // length() : 문자열 길이 반환

    // replace() : 문자를 새로운 문자로 바꾼 문자열 반환
    String replaceStr = str1.replace('H', 'h');
    System.out.println("replace() : " + replaceStr);

    str2.replace('H', 'h'); // String 특성 때문에 원본 문자열이 바뀌지 않는다
    System.out.println(str2); // Hello

    str2 = str2.replace('H', 'h'); // 바꾼값을 다시 담아 줘야한다
    System.out.println(str2); // hello

    str2 = str2.replace("ll", "LL");
    System.out.println(str2);

    // replaceAll() = replace() : 하는일 이 동일
    // replaceFirst() : 먼저 나온것만 바꾸고 싶은 경우
    str4 = "Hellollo";
    System.out.println("replace() : " + str4.replace("ll", "LL"));
    System.out.println("replaceAll() : " + str4.replaceAll("ll", "LL"));
    System.out.println("replaceFirst() : " + str4.replaceFirst("ll", "LL"));

    // split() : 문자열 분리(기준에 따라)한 후 배열로 리턴
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string);
    }

    // , 기준에 따라 분리
    str4 = "dog,cat,bear";
    strArr = str4.split(",");
    for (String string : strArr) {
      System.out.println(string);
    }

    // 문자열 전체를 지정된 숫자로 자른다
    strArr = str4.split(",", 2); // 2개로 잘라준다
    for (String string : strArr) {
      System.out.println(string);
    }

    // substring() : 시작위치부터 끝 위치에 포함된 문자열 추출
    //               endIndex 위치는 포함하지 않음
    System.out.println("substring() : " + str1.substring(1));
    System.out.println("substring() : " + str1.substring(1, 4));

    // toLowerCase() : 모든 문자를 소문자로 리턴
    // toUpperCase() : 모든 문자를 대문자로 리턴
    System.out.println("toLowerCase() : " + str1.toLowerCase());
    System.out.println("toUpperCase() : " + str1.toUpperCase());

    // toString()
    System.out.println(str1);
    System.out.println(str1.toString());

    // trim() : 앞, 뒤 공백 제거
    // 공백 하나는 문자 하나
    // "Hello" == "Hello " => 공백 때문에 다른값이다
    // 인터넷 검색어 입력에 적용할수있다
    str4 = "    Hello       World    ";
    System.out.println("trim() 전 : " + str4);
    System.out.println("trim() 후 : " + str4.trim());

    // valueOf() : 지정된 값을 문자열로 변환하여 리턴
    int num = Integer.parseInt("100"); // String -> int 변환

    String num1 = String.valueOf(100); // int -> String 변환
    System.out.println(num1);
    num1 = String.valueOf(1.3);
    System.out.println(num1);
    num1 = String.valueOf(1.3f);
    System.out.println(num1);
    num1 = String.valueOf(1000L);
    System.out.println(num1);
    num1 = String.valueOf('c');
    System.out.println(num1);
    Date d = new Date();
    num1 = String.valueOf(d);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // "100"
    type = i + ""; // "100" 바로하는 방법
    // String.valueOf(10) <=> Integer.parseInt("10")
    // String.valueOf(10.3) <=> Double.parseInt("10.3") or Double.valueOf("10.3")
    double d1 = Double.parseDouble("10.3");
    float f1 = Float.parseFloat("10.3f");
    Long.parseLong("10L");
  }
}
