package io;

import java.io.File;
import java.io.IOException;

/**
 * java.io.File : 파일과 디렉토리를 다룰 수 있음
 * 경로 구분자  : 윈도우 => \, 유닉스(리눅스) => /
 * \t, \n ... => 이것들 때문에 \ 한개만 쓸수는 없어서 \\ 두개를 사용한다
 */

public class FileEx1 {

  public static void main(String[] args) throws IOException {
    /**
     * File 객체 생성
     * File (String pathname) : 경로를 쭉 써주는것
     * File (String parent, String child) : 부모 폴더, 자식 파일
     * File (File parent, String child) : 파일 객체, 자식 파일
     */
    File f1 = new File("c:\\temp\\test1.txt");
    File f2 = new File("c:\\temp", "test1.txt");

    File dir = new File("c:\\temp\\");
    File f3 = new File(dir, "test.txt");

    String fileName = f1.getName();
    int pos = fileName.lastIndexOf(".");

    System.out.println("경로를 제외한 파일명 " + f1.getName());
    System.out.println("확장자를 제외한 파일명 " + fileName.substring(0, pos));
    System.out.println("확장자 " + fileName.substring(pos + 1));

    // 경로 메소드
    System.out.println("경로를 포한한 파일명 " + f1.getPath());
    System.out.println("파일의 절대 경로 " + f1.getAbsolutePath());
    System.out.println("파일의 정규 경로 " + f1.getCanonicalPath());
    System.out.println("파일이 속해 있는 디렉토리 " + f1.getParent());
    System.out.println();

    // 경로 구분자
    // pathSeparator : ; (윈도우일 경우)
    System.out.println("File.pathSeparator - " + File.pathSeparator);
    System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
    // separator : \ (윈도우일 경우)
    System.out.println("File.separator - " + File.separator);
    System.out.println("File.separatorChar - " + File.separatorChar);
    System.out.println();

    System.out.println("user.dir = " + System.getProperty("user.dir"));
  }
}
