package lang;

// extends Object 가 기본으로 탑재 되있다
public class Value {

  int value;

  public Value(int value) {
    this.value = value;
  }

  // Object 클래스의 equals() 를 오버라이딩 해서 다른목적으로 사용하기 위해서 재정의
  // Object obj = value2; 가 됨 (부모 = 자식 형태)
  // 값 비교로 equals 재정의(오버라이딩)
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Value) {
      Value v = (Value) obj;
      if (this.value == v.value) {
        return true;
      }
    }
    return false;
  }

  // 멤버 변수들의 값을 확인하는 용도로 재정의
  @Override
  public String toString() {
    return "Value [value=" + value + "]";
  }
}
