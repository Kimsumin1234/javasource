package exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in); // 멤버변수(클래스변수)
  static Account accArr[] = new Account[100]; // 멤버변수(클래스변수)

  public static void main(String[] args) {
    boolean run = true;
    while (run) {
      System.out.println("_______________________________________________");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("_______________________________________________");
      System.out.print("메뉴 선택 >>> ");

      int menu = Integer.parseInt(sc.nextLine());

      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          run = false;
          break;
        default:
          break;
      }
    }
  }

  static void createAccount() {
    System.out.print("계좌번호 : ");
    String accountNum = sc.nextLine();

    System.out.print("계좌주 : ");
    String name = sc.nextLine();

    System.out.print("잔액 : ");
    int balance = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accountNum, name, balance);
        System.out.println("계좌가 생성되었습니다");
        break;
      }
    }
  }

  static void accountList() {
    // 생성된 계좌목록 보여주기
    for (Account account : accArr) {
      if (account != null) {
        System.out.println(account);
      }
    }
  }

  static void deposit() {
    // 예금하다
    // 계좌번호
    System.out.print("계좌번호 : ");
    String accountNum = sc.nextLine();
    // 예금액
    System.out.print("예금액 : ");
    int amount = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    Account account = findAccount(accountNum); // 리턴 받았을때 변수대입 하는 방법

    // 찾은 요소의 잔액+예금액
    if (account != null) {
      System.out.println("현재잔액 : " + account.deposit(amount));
    }
  }

  static void withdraw() {
    // 출금하다
    // 계좌번호
    System.out.print("계좌번호 : ");
    String accountNum = sc.nextLine();
    // 출금액
    System.out.print("출금액 : ");
    int amount = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    Account account = findAccount(accountNum);
    if (account != null) {
      System.out.println("현재잔액 : " + account.withdraw(amount));
    }
  }

  static Account findAccount(String accountNum) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccountNum().equals(accountNum)) {
          return account;
        }
      }
    }
    return null; // 참조타입에 줄거 없으면 null 주면된다
  }
}
