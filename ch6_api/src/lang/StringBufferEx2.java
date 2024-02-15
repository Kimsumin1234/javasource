package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello"; (x) : String 처럼 간단하게 사용 못함

    // append() : 원본 문자열 뒤에 추가
    System.out.println("append() : " + sb1.append(" World"));
    // String 이엿다면 : String str1 = "Hello"; str1 += "123"; str2 += "456"
    sb1.append(" 123").append("456").append("12.3f");
    System.out.println(sb1); // Hello World 원본값이 변경됨

    // charAt()
    System.out.println(sb1.charAt(3));

    // delet() : 끝 위치 문자는 제외하고 삭제
    sb1.delete(3, 6);
    System.out.println(sb1);

    sb1.deleteCharAt(5);
    System.out.println(sb1);

    // insert() : 지정한 위치에 삽입
    sb1.insert(4, " 012345 ");
    System.out.println(sb1);

    // length()

    // replace()
    // 원본이 바뀌어서 다시 담는 작업을 안해도된다
    sb1.replace(0, 3, "AB");
    System.out.println(sb1);

    // String 로 9876543210 출력하기
    String str2 = "0123456789";

    System.out.println(str2.charAt(9));
    System.out.println(str2.charAt(8));
    System.out.println(str2.charAt(7));
    for (int i = str2.length() - 1; i >= 0; i--) {
      System.out.print(str2.charAt(i));
    }
    System.out.println();

    // StringBuffer 로 9876543210 출력하기
    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());

    // String => StringBuffer
    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());

    sb1.setCharAt(1, 'k');
    System.out.println(sb1);

    // StringBuffer 과 비슷
    StringBuilder sBuilder = new StringBuilder("Hello");
  }
}
