package loop;

// continue 이후의 구문 건너뛰게 함
public class ContinueEx1 {

  public static void main(String[] args) {
    // 3,6,9 제외
    for (int i = 0; i < 11; i++) {
      if (i % 3 == 0) continue;
      System.out.println(i);
    }

    System.out.println("\n\n");

    // 짝수만 출력
    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) continue;
      System.out.println(i);
    }
  }
}
