package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {

  public static void main(String[] args) throws IOException {
    File temp = new File("c:\\temp");
    File dir = new File("c:\\temp\\dir");
    File file1 = new File("c:\\temp\\file1.txt");
    File file2 = new File(temp, "file2.txt");
    File file3 = new File("c:\\temp\\dir\\file3.txt");
    File file4 = new File("c:\\temp\\dir\\Hello.java");

    // 존재하지 않을때 새로 생성
    // 빨간줄 뜨면 throws 로 퀵픽스
    // 이미 존재하는 파일은 다시 만들지 않음
    if (!dir.exists()) dir.mkdirs();
    if (!file1.exists()) file1.createNewFile();
    if (!file2.exists()) file2.createNewFile();
    if (!file3.exists()) file3.createNewFile();
    if (!file4.exists()) file4.createNewFile();

    // temp 폴더 읽어오기
    // lastModified() : 1970-01-01 을 시작으로 현재 오늘날짜 까지의 지난 시간을 밀리세컨드 로 돌려줌
    // 1708498349240 -> 2024-02-21 오후 3:11 요런식으로 변환하기
    // lastModified() -> Date 타입으로 변환하기 -> SimpleDateFormat 으로 원하는 형태로 출력하기
    File[] files = temp.listFiles();

    // yyyy : 년도 4자리, MM : (대문자) 월 2자리, dd : 일자 2자리, a(am/pm 표시), HH : 시, mm : 분
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

    // 날짜 시간 형태 크기 이름
    System.out.println("================================");
    System.out.println("  날짜  시간  형태  크기  이름  ");
    System.out.println("================================");
    for (File file : files) {
      String fileName = file.getName();
      //   Date date = new Date(file.lastModified());
      //   System.out.println(date); - Wed Feb 21 15:52:29 KST 2024
      //   System.out.print(sdf.format(date));
      System.out.print(sdf.format(new Date(file.lastModified())));
      if (file.isDirectory()) {
        System.out.println("\t<DIR>\t\t\t" + fileName);
      } else {
        System.out.println("\t\t\t" + file.length() + "\t" + fileName);
      }
    }
  }
}
