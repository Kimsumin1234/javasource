package poly;

// 다형성

public class EmployeeEx {

  public static void main(String[] args) {
    Employee employee = new Employee("홍길동", "사원");
    // employee.work();
    work(employee);

    // employee = new Ceo("김유신", "회장");
    // employee.work();
    Ceo ceo = new Ceo("김유신", "회장");
    // ceo.work();
    work(ceo); // employee = ceo;

    // employee = new Admin("김동호", "관리자");
    // employee.work();
    Admin admin = new Admin("김동호", "관리자");
    // admin.work();
    work(admin);

    // employee = new PartTime("정우성", "아르바이트");
    // employee.work();
    PartTime partTime = new PartTime("정우성", "아르바이트");
    // partTime.work();
    work(partTime);
  }

  // 범위가 다른 변수를 사용하는법 매게변수를 활용한다
  // 왼쪽은 부모 = 오른쪽은 자식 형태 활용
  public static void work(Employee employee) {
    // work 전용 메소드
    employee.work();
  }
}
