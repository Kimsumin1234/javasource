package array;

public class ArrayEx1 {

  public static void main(String[] args) {
    // 배열(array) : 같은 타입의 변수를 하나의 묶음으로 처리
    // 타입[] 배열명 = new 타입[길이]; [] <- 배열기호
    // 배열 선언, 생성하면 초기화까지 일어남

    // int 타입의 변수가 5개 필요
    int[] arr1 = new int[5];
    float arr2[] = new float[10]; // 변수가 10개 필요
    boolean arr3[] = new boolean[2];
    char arr4[] = new char[2];

    // int i; : 로컬 변수는 값을 줘서 무조건 초기화를 해야함

    System.out.println(arr1); // [I@7a81197d ==> 메모리 주소
    System.out.println(arr1[0]); // 0 으로 알아서 초기화 되있음, int 와 같은 타입들도 동일
    // 배열 값 확인
    // System.out.println(i); // 초기화 안해서 에러남
    System.out.println(arr2[0]); // 0.0 으로 알아서 초기화 되있음, 동일 타입 동일
    System.out.println(arr3[0]); // false 으로 알아서 초기화 되있음
    System.out.println(arr4[0]); // ' ' 초기화
  }
}
