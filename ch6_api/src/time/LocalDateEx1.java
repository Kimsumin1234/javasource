package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 날짜/시간 객체
 * Date,Calendar
 * 처음부터 제공되던 클래스임 => 단점이 존재(코드가 길어짐)
 * Java 1.8 버전 부터 => java.time 패키지 추가
 */

public class LocalDateEx1 {

  public static void main(String[] args) {
    Date date = new Date();

    System.out.println(date); // Thu Feb 22 14:36:55 KST 2024

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(sdf.format(date)); // 2024-02-22

    // Calendar 는 new 를 못한다
    Calendar calendar = Calendar.getInstance();
    System.out.println("년도 : " + calendar.get(Calendar.YEAR));
    System.out.println("월(0~11), 0=1월 :" + calendar.get(Calendar.MONTH));
    System.out.println(
      "이 달의 몇 째 주 : " + calendar.get(Calendar.WEEK_OF_MONTH)
    );
    System.out.println("이 달의 몇 일 : " + calendar.get(Calendar.DATE));
    System.out.println(
      "이 달의 몇 일 : " + calendar.get(Calendar.DAY_OF_MONTH)
    );
    System.out.println("이 해의 몇 일 : " + calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println("시간(0~11) : " + calendar.get(Calendar.HOUR));
    System.out.println("시간(0~23) : " + calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println("분(0~59) : " + calendar.get(Calendar.MINUTE));
    System.out.println("초(0~59) : " + calendar.get(Calendar.SECOND));
  }
}
