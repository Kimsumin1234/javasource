package exam;

public class CalcEx {

  public static void main(String[] args) {
    // 객체 생성 (Calc 클래스를 사용하기 위해서)
    Calc calc = new Calc();

    // 클래스 메소드가 void 가 아닐경우 호출 방법 2가지
    // result 와 같이 변수에 대입해서 출력
    int result = calc.add(15, 20);

    System.out.println("덧셈 결과 : " + result);
    // 변수에 대입 안하고 바로 출력
    System.out.println("곱셈 결과 : " + calc.multiply(3, 5));
    // 나눗셈 변수에 대입
    int result2 = calc.divide(20, 10);

    System.out.println("나눗셈 결과 : " + result2);
  }
}
