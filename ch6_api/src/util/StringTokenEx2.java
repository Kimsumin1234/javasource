package util;

import java.util.StringTokenizer;

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";

    // 기준이 1개씩이면 StringTokenizer 사용 할수 있다
    // 기준을 주지 않을 경우 공백 한번 기준으로 잘라준다
    StringTokenizer st = new StringTokenizer(str);
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    // delim : 자르는 기준을 모두쓴다, returnDelims : 자른 기준을 리턴 받으면 true
    str = "x=100*(200+300)/2";
    StringTokenizer st2 = new StringTokenizer(str, "=*/+()", true);
    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }

    str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
    StringTokenizer st3 = new StringTokenizer(str, ",|");
    while (st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }

    System.out.println();

    st3 = new StringTokenizer(str, "|");
    while (st3.hasMoreTokens()) {
      String token = st3.nextToken(); // 1,김천재,100,100,100
      StringTokenizer st4 = new StringTokenizer(token, ",");
      while (st4.hasMoreTokens()) {
        System.out.println(st4.nextToken());
      }
      System.out.println("--------------------------------");
    }
  }
}
