package condition;

// if~else if 처리 대체

public class SwitchEx1 {

  public static void main(String[] args) {
    char ch1 = 'a';
    switch (ch1) {
      case 'a': // 부등호가 못들어옴, 같다라는 의미가 포함
        System.out.println("a 입니다.");
        break; // break; 구문이 밑으로 실행되는걸 막음
      case 'b': // 부등호가 못들어옴, 같다라는 의미가 포함
        System.out.println("b 입니다.");

        break;
      default: // default 생략가능
        System.out.println("a 도  b도 아닙니다.");
        break;
    }
  }
}
