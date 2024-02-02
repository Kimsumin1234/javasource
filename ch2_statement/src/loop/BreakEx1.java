package loop;

public class BreakEx1 {

  public static void main(String[] args) {
    // break; => switch
    // while (true) -> 이대로 실행하면 무한루프에 걸리게됨, break; 를 걸어서 도중에 멈추게 해야함

    int sum = 0, i = 0;
    while (true) {
      if (sum > 100) break;
      ++i;
      sum += i;
    }
    System.out.printf("i=%d, sum=%d\n", i, sum);
  }
}
