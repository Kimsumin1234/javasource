package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambda.Student;

public class FromCollectionEx {

  static int sum = 0;

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
      new Student("홍길동", 90, 80),
      new Student("강호동", 80, 70),
      new Student("송진호", 70, 60)
    );
    // students.forEach(student ->
    //   System.out.println(
    //     student.getName() + " : " + student.getKor() + ", " + student.getMath()
    //   )
    // );

    /**
     *  Stream 객체로 변환
     */
    Stream<Student> stream = students.stream();
    stream.forEach(student ->
      System.out.println(
        student.getName() + " : " + student.getKor() + ", " + student.getMath()
      )
    );

    /**
     * java.nio.file.Path
     *  - nio : io 를 향상시킨 패키지 (기능이 추가됨)
     *  - stream 으로 돌려주는 기능이 있다
     */
    Path path = Paths.get("c:\\temp");

    try (Stream<Path> stream2 = Files.list(path);) {
      // 파일명 출력
      stream2.forEach(file -> System.out.println(file.getFileName()));
    } catch (Exception e) {
      e.printStackTrace();
    }
    // 1~100 까지의 합
    // int sum = 0;
    // for (int i = 1; i < 101; i++) {
    //   sum += i;
    // }
    // System.out.println(sum);

    // 특정 범위의 정수를 스트림으로 생성
    IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
    System.out.println();
    IntStream.rangeClosed(0, 10).forEach(i -> System.out.print(i + " "));
    System.out.println();

    IntStream.rangeClosed(1, 100).forEach(i -> sum += i);
    System.out.println("sum = " + sum);
  }
}
