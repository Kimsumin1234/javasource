package exam2;

import java.util.Scanner;

public class CalcEx {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input Num1 : ");
    int num1 = Integer.parseInt(sc.nextLine());
    System.out.print("Input Num2 : ");
    int num2 = Integer.parseInt(sc.nextLine());
    System.out.print("Input Operator : ");
    String op = sc.nextLine(); // 사칙연산(*,/,+,-)

    Calc calc = null;
    switch (op) {
      case "+":
        calc = new Add();
        break;
      case "-":
        calc = new Sub();
        break;
      case "*":
        calc = new Mul();
        break;
      case "/":
        calc = new Div();
        break;
      default:
        break;
    }
    calc.setValue(num1, num2);
    System.out.println(calc.calculate());
  }
}
