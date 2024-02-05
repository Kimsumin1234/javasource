package array;

public class ArrayEx11 {

  public static void main(String[] args) {
    // String 배열
    String[] names = { "Kim", "Park", "Choi" };

    for (String str : names) {
      System.out.println(str);
    }

    for (int i = 0; i < names.length; i++) { // 배열에서는 length가 () 없다
      String str = names[i];

      for (int j = 0; j < str.length(); j++) { // 메소드는 length가 () 있다
        char ch = str.charAt(j); // 문자열을 하나씩 쪼개볼수 있다
        System.out.printf("str,charAt(%d) : %c\n", j, ch);
      }
    }

    String src = "ABCDE";

    char[] chArr = src.toCharArray();
    System.out.println(chArr);
  }
}
