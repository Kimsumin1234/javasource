package ch4;

public class TimeEx {

  public static void main(String[] args) {
    Time time = new Time();
    time.setHour(15);
    time.setMinute(40);
    time.setSecond(11.12f);

    System.out.println(time.getHour());

    Time time2 = new Time();
    time.setHour(16);
    time.setMinute(38);
    time.setSecond(13.12f);
  }
}
