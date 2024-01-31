package operator;

// 산술연산자 : +, -, *, /, %(나머지 값)
public class ArithmeticEx1 {

  public static void main(String[] args) {
    int num1 = 5, num2 = 2;
    int result1 = num1 + num2;
    System.out.printf("%d + %d=%d\n", num1, num2, result1);

    result1 = num1 - num2;
    System.out.printf("%d - %d=%d\n", num1, num2, result1);

    result1 = num1 * num2;
    System.out.printf("%d * %d=%d\n", num1, num2, result1);

    result1 = num1 / num2;
    System.out.printf("%d / %d=%d\n", num1, num2, result1); // 자바에는 정수 나눗셈 했을때는 몫 값만 나온다 2.5 (x)

    result1 = num1 % num2;
    System.out.printf("%d %% %d=%d\n", num1, num2, result1); // %% 도 \\ 때랑 같은경우

    double d1 = 6.0d;
    int d2 = 4;

    double result2 = d1 / d2;
    System.out.printf("%f / %d=%f\n", d1, d2, result2); // 자바에는 실수 나눗셈 했을때는 몫 나머지 다 나온다

    result2 = d1 % d2;
    System.out.printf("%f %% %d=%f\n", d1, d2, result2);

    char ch1 = 'A' + 1; // A 가 65 고유코드가 있기때문에 B 가 출력
    // char ch2 = ch1 + 1;
    System.out.printf("ch=%c", ch1);
  }
}
