package condition;

public class IfEx4 {

  public static void main(String[] args) {
    // 점수가 >=90 A, >=80 B, >=70 C, >=60 D, F
    int score = 75;
    char grade; // 초기화하는 방법 char grade = ' '; 공백을 넣어준다
    if (score >= 90) {
      //   System.out.println("등급은 A 입니다");
      grade = 'A';
    } else if (score >= 80) {
      //   System.out.println("등급은 B 입니다");
      grade = 'B';
    } else if (score >= 70) {
      //   System.out.println("등급은 C 입니다");
      grade = 'C';
    } else if (score >= 60) {
      //   System.out.println("등급은 D 입니다");
      grade = 'D';
    } else {
      //   System.out.println("등급은 F 입니다");
      grade = 'F';
    }

    System.out.println("등급은 " + grade + " 입니다");
    System.out.printf("등급은 %c 입니다\n", grade);
  }
}
