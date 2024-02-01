package loop;

public class ForEx5 {

  public static void main(String[] args) {
    // *
    for (int j = 0; j < 1; j++) {
      System.out.print("*");
    }
    System.out.println();
    // **
    for (int j = 0; j < 2; j++) {
      System.out.print("*");
    }
    System.out.println();
    // ***
    for (int j = 0; j < 3; j++) {
      System.out.print("*");
    }
    System.out.println();
    // ****
    for (int j = 0; j < 4; j++) {
      System.out.print("*");
    }
    System.out.println();
    // *****
    for (int j = 0; j < 5; j++) {
      System.out.print("*");
    }
    System.out.println();
    // ******
    for (int j = 0; j < 6; j++) {
      System.out.print("*");
    }
    System.out.println();
    // 이런 형태의 구조는 무조건 for문이 2개 들어간다 (행과 열이 있는 형태)

    System.out.println("\n\n\n");

    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
