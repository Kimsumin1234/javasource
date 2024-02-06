package ch4;

// 시,분,초는 모두 0보다 크거나 같아야 한다
// 시의 범위는 0~23, 분,초의 범위는 0~59 이다
public class Time {

  // 명칭 : 멤버변수, 속성, 필드, 인스턴스 변수
  private int hour;
  private int minute;
  private float second;

  // 클래스 변수 (static)
  private static String max;

  //
  public int getHour() {
    return hour;
  }

  // 메소드 내부에 선언된 변수 : 지역(로컬)변수
  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return; // void 타입일 경우에 이렇게 사용해도 된다
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute > 59) return;
    this.minute = minute;
  }

  public float getSecond() {
    return second;
  }

  public void setSecond(float second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }
}
