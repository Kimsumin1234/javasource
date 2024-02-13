package poly;

// 다형성(Polymorphism)
// 부모 클래스 타입의 참조변수로 자손 클래스의 인스턴스 참조      예시) Parent child1 = new Child();
// 형변환 : 자손타입 -> 조상타입 (자동형변환)
//         조상타입 -> 자손타입 (강제형변환)
//         참조 변수의 타입을 변환하는 것으로 참조할수 있는 범위를 조절하는 개념

public class ChildEx {

  public static void main(String[] args) {
    // child 으로 접근 가능한 범위
    // field1, method1(), merthod2(), field2, method3()
    Child child = new Child();

    // 상속관계라면, 왼쪽이 부모-오른쪽이 자식 이 올수가 있다
    // child1 으로 접근 가능한 범위
    // field1, method1(), method2() => 부모꺼(오버라이딩 하기전에는 부모꺼만 뜬다)
    Parent child1 = new Child();
    child1.method2(); // 오버라이딩 된 메소드라면 자식 메소드가 실행
  }
}
