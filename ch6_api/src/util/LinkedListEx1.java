package util;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List
 * 1. ArrayList
 * 2. LinkedList : 연결 리스트
 *                 배열 마지막에 주소값을 하나 남겨둬서 List를 연결할때 남겨둔 주소값을 찾아서 연결한다
 *    ArrayList,Vector 의 단점인 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸리는 부분을 보완
 */
public class LinkedListEx1 {

  public static void main(String[] args) {
    List<String> list = new LinkedList<>();

    list.add("사과");
    list.add("배");
    list.add("딸기");
    list.add("바나나");
    list.add("수박");
    list.add("멜론");

    for (String string : list) {
      System.out.println(string);
    }
  }
}
