// package 구문
package com.project.book;

// import 구문 => 다른 패키지에 있는 클래스 사용시
import java.text.SimpleDateFormat; // java. (java 패키지 밑에 text 패키지 밑에 ~)
import java.time.LocalDateTime;
// import java.util.Date;
// import java.util.Scanner;
import java.util.*; // java util 패키지 밑에 모든 클래스 가져오기

// 클래스 선언
public class Book {

  public static void main(String[] args) {
    Date date = new Date();
    // System.out.println(date.toString());  date 클래스에 이미 toString()이 오버라이딩 되있다
    System.out.println(date);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    System.out.println(sdf.format(date));

    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);

    Scanner sc = new Scanner(System.in);
  }
}
