package io;

import java.io.Serializable;

/**
 * 런타임 Exception
 * java.io.NotSerializableException: io.Person
 * 해결방법 : public class Person implements Serializable { } - Person 클래스는 네트워크를 통해서 주고 받을 수 있는 객체입니다
 */
public class Person implements Serializable {

  private String name;
  private String job;
  /**
   * transient : 직렬화 대상에서 제외
   *             ObjectInputStream 로 읽어보면 null 이 나온다
   */
  private transient String tel;

  public Person(String name, String job, String tel) {
    this.name = name;
    this.job = job;
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", job=" + job + ", tel=" + tel + "]";
  }
}
