package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;
    int bank = 0; // 잔액

    while (run) {
      System.out.println("________________________________");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("________________________________");
      System.out.print("메뉴 선택 >> ");

      int menu = sc.nextInt();

      switch (menu) {
        case 1:
          // 예금액 입력 받은 후 잔액 추가
          System.out.print("예금 입력 >> ");
          bank += sc.nextInt();
          break;
        case 2:
          // 출금액 입력 받은 후 잔액 감소
          System.out.print("출금 입력 >> ");
          bank -= sc.nextInt();
          break;
        case 3:
          // 잔액 출력
          System.out.println("잔액 >> " + bank);
          break;
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
      }
    }
  }
}
