package lang;

// java.lang.* : 기본 패키지(import 구문 없이 사용가능)
// java.lang.Object : 모든 클래스의 최고 조상(부모)
//         equals() : 는 == 과 같은 역할, 주소를 비교하는 구문(Object 클래스일 경우)
//       toString() : 객체 자신의 정보를 문자열로 변환(Object 클래스일 경우) => 그냥은 쓸 이유가 없어서 무조건 오버라이딩 함
public class ObjectEx {

  public static void main(String[] args) {
    // 클래스를 사용한다면
    // 인스턴스 생성하기(생성자가 있을경우)
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) {
      System.out.println("두 객체는 같다.");
    } else {
      System.out.println("두 객체는 다르다.");
    }

    if (obj1 == obj2) {
      System.out.println("두 객체는 같다.");
    } else {
      System.out.println("두 객체는 다르다.");
    }

    // java.lang.Object@7a81197d
    System.out.println("obj1 toString() : " + obj1.toString());
    System.out.println("obj2 toString() : " + obj2.toString());

    Value value1 = new Value(10);
    Value value2 = new Value(10);

    // Object.equals() 는 주소 비교라서 다르다 가 나오지만
    // Value.equals() 는 값 비교로 재정의(오버라이딩) 했기 때문에 같다 가 나온다
    if (value1.equals(value2)) {
      System.out.println("두 객체는 같다.");
    } else {
      System.out.println("두 객체는 다르다.");
    }

    // lang.Value@3a71f4dd
    // 오버라이딩 : Value [value=10]
    // 멤버 변수들의 값을 확인하는 용도로 재정의
    System.out.println("value1 toString() : " + value1.toString());
    System.out.println("value1 toString() : " + value1); // toString()을 안해도 오버라이딩 된 형태로 출력이된다

    Member member1 = new Member("hong123");
    Member member2 = new Member("hong123");

    // equals() 는 값 비교로 재정의 해서 같다가 나오지만
    // == 은 그대로 주소 비교 이기 때문에 다르다가 나온다
    System.out.println(member1.equals(member2) ? "같다" : "다르다");
    System.out.println(member1 == member2 ? "같다" : "다르다");
  }
}
