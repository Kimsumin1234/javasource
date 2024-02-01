package condition;

/* 제어문 - 1)조건문 2)반복문
 * 1) 조건문 : 조건에 따라 다음 문장 수행 여부 결정
 *    if, switch
 */

public class IfEx1 {

  public static void main(String[] args) {
    // if(조건식){
    //     조건식이 참일때 수행될 문장들 나열
    //   }
    // (조건식) : true 나 false가 무조건 나오는 식만 사용가능
    // {} 생략 가능한 조건 : 수행할 구문이 한 개일때

    int x = 0;

    if (x == 0) {
      System.out.println("x == 0");
    }
    if (x != 0) {
      System.out.println("x != 0");
    }
    if (!(x == 0)) {
      System.out.println("!(x == 0)");
    }
    if (!(x != 0)) System.out.println("!(x != 0)");
    // if(x == 0); {} 마침표 위치 주의
  }
}
