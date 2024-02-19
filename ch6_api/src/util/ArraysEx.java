package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Arrays : 배열을 다루는데 유용한 메소드가 정의되어 있음
 * static 요소로 구성
 */
public class ArraysEx {

  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 0, 4, 5 };
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[6];
    Arrays.fill(arr2, 9);
    System.out.println(Arrays.toString(arr2));

    System.out.println("배열 요소 비교 : " + Arrays.equals(arr, arr2));
    /**
     * Array.asList(배열) : 배열을 List 구조로 변경
     */
    List<Integer> list = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
    /**
     * UnsupportedOperationException (런타임 에러) : 반환된 List 크기를 변경할 수 없음
     * list.add(6);
     */

    /**
     * 기존 배열 + 새로 추가 하는방법
     */
    List<Integer> list3 = new ArrayList<>(
      Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 })
    );
    list3.add(6);

    /**
     * sort() : 오름차순 정렬
     */
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    /**
     * linearSearch() : 순차 검색 (첫 번째 요소부터 하나씩 검색/ 정렬상관없음)
     * binarySearch() : 이진 검색 (전제조건 : 오름차순 정렬된상태)
     *                  값이 없으면 음수로 결과가 나옴
     */
    System.out.println("2의 위치 : " + Arrays.binarySearch(arr, 2));
    /**
     * 내림차순 정렬
     * T[] : T => 배열이 객체 타입이라는 의미
     * Map<K,V> : K,V ==> 객체 타입이라는 의미
     * Collection<E> : E => 객체 타입
     * int 를 객체타입 으로 변환 => Integer
     *
     * sort 는 오름차순 이다 내림차순을 하려면 기본타입을 객체타입으로 바꿔주면된다
     */
    Integer arr3[] = { 27, 55, 15, 6, 9, 75 };
    Arrays.sort(arr3, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr3));

    String[] strArr = { "cat", "Dog", "lion", "tiger", "apple", "zoo" };
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr, Comparator.reverseOrder());
    System.out.println(Arrays.toString(strArr));
  }
}
