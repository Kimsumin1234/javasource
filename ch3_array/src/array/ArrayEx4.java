package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    // 'a','b','c','d' char 1차원 선언, 생성
    char chArr[] = { 'a', 'b', 'c', 'd' };
    System.out.println(chArr); // abcd 문자만 이렇게 나옴, 다른것들은 메모리 주소값이 나옴

    int intArr[] = { 78, 88, 9, 86, 55 };
    System.out.println(intArr);
    // 메모리 주소값이 나온다면 Arrays.toString() 사용하면 된다
    System.out.println(Arrays.toString(intArr)); // [78, 88, 9, 86, 55]

    // 배열 복사
    // 더 큰 배열을 생성 => 기존 배열 새로운 배열에 복사
    int temp[] = new int[intArr.length * 2];
    // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 (에러코드)
    for (int i = 0; i < intArr.length; i++) {
      temp[i] = intArr[i];
    }
    intArr = temp; // 2배로 늘어난 temp 주소값을 intArr 주소에 대입함
    System.out.println("복사 후 " + Arrays.toString(intArr)); // 복사한 주소를 대입했기떄문에 intArr 주소를 찍어도 늘어난 값이 나온다

    // "abc", "def", "hij", "apple"
    String strArr[] = { "abc", "def", "hij", "apple" };
    System.out.println(strArr);
    System.out.println(Arrays.toString(strArr)); // [abc, def, hij, apple]
  }
}
