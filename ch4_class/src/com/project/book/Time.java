package com.project.book;

// 접근 제어자 : 클래스, 멤버변수, 메소드, 생성자   지역변수는 x
// private  : 같은 클래스 내에서만 접근 가능
// default  : 같은 패지지 내에서만 접근 가능 (아무것도 안 붙는경우)
// protected : 같은 패키지 + 다른 패키지의 자손 클래스
// public  : 접근 제한 없음

// 대상에 따라 사용할 수 있는 접근 제어자
// 클래스 - publin or default
// 메소드,멤버변수 - private, default, protected, public

// 범위 : public > protected > default > private

public class Time {

  private int hour; // 맴버변수는 보통 private 붙임
  private int minute;
  private int socond;

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  // 내부에서만 사용하는 용도로 메소드에 private 붙이는 경우도 있다, 대부분은 public 사용
  private void print() {}
}
