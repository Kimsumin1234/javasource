package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

  public static void main(String[] args) {
    /**
     * ArrayList 와 LinkedList 성능 차이
     * 순차적으로 추가/삭제 시 ArrayList 가 LinkedList 보다 빠르다
     * 중간 데이터를 추가/삭제 시 LinkedList 가 ArrayList 보다 빠르다
     * ArrayList 는 충분한 공간(initial capacity)이 확보가 되야 성능이 나온다
     */
    ArrayList<String> aList = new ArrayList<>(2000000);
    LinkedList<String> linkedList = new LinkedList<>();

    System.out.println("순차적 추가 비교");
    System.out.println("ArrayList add1() : " + add1(aList));
    System.out.println("LinkedList add1() : " + add1(linkedList));
    System.out.println();
    System.out.println("중간 추가 비교");
    System.out.println("ArrayList add2() : " + add2(aList));
    System.out.println("LinkedList add2() : " + add2(linkedList));
    System.out.println();
    System.out.println("중간 삭제 비교");
    System.out.println("ArrayList remove2() : " + remove2(aList));
    System.out.println("LinkedList remove2() : " + remove2(linkedList));
    System.out.println();
    System.out.println("순차 삭제 비교");
    System.out.println("ArrayList remove1() : " + remove1(aList));
    System.out.println("LinkedList remove1() : " + remove1(linkedList));
  }

  public static long add1(List<String> list) {
    /**
     * System.currentTimeMillis() : 현제시간을 밀리세컨드 단위로 가져옴
     * list.add(i + "") : 리스트에 순차적 추가
     * end - start : 시간이 얼마나 걸렸는가 알아보는것
     */
    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
      list.add(i + "");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long add2(List<String> list) {
    /**
     * list.add(500, "X") : 리스트 중간에 추가
     */
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.add(500, "X");
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long remove1(List<String> list) {
    /**
     * 뒤에서 부터 순차적으로 지운다
     */
    long start = System.currentTimeMillis();
    for (int i = list.size() - 1; i >= 0; i--) {
      list.remove(i);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }

  public static long remove2(List<String> list) {
    /**
     * 앞에서 부터 순차적으로 지운다 -> 앞에껄 지우면 앞으로 땡겨야 되기 때문에 중간삭제 시간이라고 봐도된다
     */
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      list.remove(i);
    }
    long end = System.currentTimeMillis();
    return end - start;
  }
}
