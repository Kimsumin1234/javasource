package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림 연산
 *  1) 중간 연산 : 연산 결과가 스트림인 연산 (연속해서 중간 연산 가능)
 *                필터링, 정렬, 그룹핑
 *
 *  2) 최종 연산 : 연산 결과가 스트림이 아닌 연산 (스트림의 요소를 소모하므로 단 한번만 가능)
 *                합계, 평균, 카운트, 최소값, 최대값
 */

public class StreamEx1 {

  public static void main(String[] args) {
    List<String> strList = Arrays.asList(
      "사과",
      "배",
      "포도",
      "귤",
      "수박",
      "바나나",
      "포도",
      "귤",
      "수박"
    );
    String[] strArr = {
      "비행기",
      "자동차",
      "자전거",
      "버스",
      "오토바이",
      "지하철",
    };

    // 스트림 변환
    Stream<String> stream1 = Arrays.stream(strArr);
    Stream<String> stream2 = strList.stream();

    /**
     * 중간 연산
     *  - skip(숫자), limit(숫자) : 스트림 자르기
     */
    // stream1.skip(2).forEach(item -> System.out.println(item));
    stream1.skip(2).forEach(System.out::println);
    System.out.println();
    // stream2.skip(2).limit(3).forEach(item -> System.out.println(item));
    stream2.skip(2).limit(3).forEach(System.out::println);
    System.out.println();

    /**
     * 런타임 에러 : IllegalStateException: stream has already been operated upon or closed
     *  - 일회용임 (스트림을 한번 사용하면 닫힘)
     *  - stream2.distinct().forEach(System.out::println); => stream2 는 한번 사용해서 다른 stream 을 만들어야함
     *  - Arrays.asList() 사용시 수정이 불가능 해서 중복제거가 안됬다
     *  - strList.add("파인애플"); => UnsupportedOperationException 수정 불가능
     *  - .collect(Collectors.toList()) => List 로 다시 담아서 하면 된다
     */

    strList
      .stream()
      .distinct()
      .collect(Collectors.toList())
      .forEach(System.out::println);

    System.out.println();

    // distinct() : 스트림의 중복 요소 제거
    IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
    intStream.distinct().forEach(System.out::print);

    // filter() : 조건에 맞지 않는 요소 제외
    System.out.print("\nfilter() : ");
    IntStream intStream2 = IntStream.of(15, 16, 17, 18, 19);
    // 2로 나눈 나머지가 0이 아니고, 3으로 나눈 나머지가 0이 아닌 요소 찾기

    // intStream2
    //   .filter(i -> i % 2 != 0)
    //   .filter(i -> i % 3 != 0)
    //   .forEach(System.out::print);

    intStream2.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::print);
  }
}
