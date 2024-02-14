package exception;

public class FinallyEx {

  public static void main(String[] args) {
    try {
      System.out.println(args[0]);
      System.out.println("예외 발생시 미 처리"); // 위가 예외가 발생해서 실행 미처리
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("무조건 실행"); // finally{} : 예외의 발생 여부와 상관없이 무조건 실행하는 구문
    }

    // try catch 구문 형태
    try {} finally {}
    try {} catch (Exception e) {}
    try {} catch (Exception e) {} finally {}
  }
}
