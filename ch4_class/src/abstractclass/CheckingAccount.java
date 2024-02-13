package abstractclass;

// 무조건 자식 클래스에서 부모의 미완성 부분(추상메소드)을 완성해야 한다

public class CheckingAccount extends Account {

  @Override
  public void print() {}
}
