package ch4;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 stuArr[] = new Student3[3];
    // System.out.println(stuArr[0]); // null, 클래스 배열은 처음 초기화값이 null 이다
    // System.out.println(stuArr[0].getId()); // Exception in thread "main" java.lang.NullPointerException,
    Scanner sc = new Scanner(System.in); // Scanner 라는 객체생성, System.in : 키보드에서 들어올거다

    for (int i = 0; i < stuArr.length; i++) {
      stuArr[i] = new Student3();
      // 아이디, 이름, 국어, 영어, 수학점수 입력받아서 초기화
      System.out.print("Input Id : ");
      String id = sc.nextLine();

      System.out.print("Input Name : ");
      String name = sc.nextLine();

      System.out.print("Input Kor : ");
      int kor = Integer.parseInt(sc.nextLine()); // "88" => 88 바꿔준다, nextLine 이랑 nextInt 가 섞이면 nextInt 가 엔터입력을 남기기 때문에 같이 쓰기 힘들다

      System.out.print("Input Eng : ");
      int eng = Integer.parseInt(sc.nextLine());

      System.out.print("Input Math : ");
      int math = Integer.parseInt(sc.nextLine());

      stuArr[i].setId(id);
      stuArr[i].setName(name);
      stuArr[i].setKor(kor);
      stuArr[i].setEng(eng);
      stuArr[i].setMath(math);
    }
    // 확인 해보기
    System.out.println("===============================================");
    System.out.println("아이디   이름   국어   영어   수학   총점    평균");
    System.out.println("===============================================");

    for (Student3 student3 : stuArr) { // Student3 student3 = stuArr[i]; 이것과 동일한 의미
      //   System.out.println(student3); ==> toString() 과 동일
      // 모든 학생들의 정보 접근
      // System.out.print(student3.getId()+" "+student3.getName()+" "+student3.getKor()+" "+student3.getEng()+" "+student3.getMath());

      int total = student3.getKor() + student3.getEng() + student3.getMath();
      System.out.printf(
        "%s %s %d %d %d  %d %.2f\n",
        student3.getId(),
        student3.getName(),
        student3.getKor(),
        student3.getEng(),
        student3.getMath(),
        total,
        total / 3.0
      );
    }

    System.out.println("===============================================");
    System.out.println("아이디   이름   국어   영어   수학   총점    평균");
    System.out.println("===============================================");

    for (int i = 0; i < stuArr.length; i++) {
      int total = stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath();
      System.out.printf(
        "%s   %s   %d   %d   %d   %d   %.2f\n",
        stuArr[i].getId(),
        stuArr[i].getName(),
        stuArr[i].getKor(),
        stuArr[i].getEng(),
        stuArr[i].getMath(),
        total,
        total / 3.0
      );
    }
  }
}
