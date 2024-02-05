package ch4;

public class StudentEx {

  public static void main(String[] args) {
    // 객체(인스턴스) 생성

    Student student = new Student();
    // 생성된 인스턴스 값 확인
    System.out.println(student); // ch4.Student@5ca881b5
    System.out.println(student.id); // null
    System.out.println(student.name); // null
    System.out.println(student.addr); // null
    System.out.println(student.hp); // null

    // 생성된 인스턴스에 값 할당
    // 학생 첫번째 에대한 정보 생성
    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-4567";

    System.out.println(student.id); // 20241212
    System.out.println(student.name); // 홍길동
    System.out.println(student.addr); // 서울시 종로구
    System.out.println(student.hp); // 010-1234-4567

    // 학생 두번째 에대한 정보 생성
    // 자동으로 생성자 호출 new Student()
    Student student2 = new Student();
    student2.id = "20241013";
    student2.name = "성춘향";
    student2.addr = "구로구 궁동";
    student2.hp = "010-4567-8950";
  }
}
