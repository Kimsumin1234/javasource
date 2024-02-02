package loop;

public class ForEx7 {

  public static void main(String[] args) {
    // 1 ~ 100 까지 숫자 중에서 3의 배수만 더하기(단, 9의 배수는 빼고)
    int sum = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 9 != 0) {
        sum += i;
      }
    }
    System.out.println("1~100 숫자 중에서 3의 배수의합(9의배수는 제외)" + sum);

    // 1~100까지 숫자 중에서 3과 5배수의 합
    int sum2 = 0;
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum2 += i;
      }
    }
    System.out.println("1~100 까지 숫자 중에서 3과 5배수의 합" + sum2);
  }
}
