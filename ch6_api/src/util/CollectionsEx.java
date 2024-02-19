package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections 클래스 (Collection 은 인터페이스다)
 *
 * 목적 : Collection(List, Set, Map)과 관련된 메소드 제공
 * 전부 static 요소로 구성
 * 동기화, fill(), copy(), sort(), binarySearch() 같은 유용한 메소드 제공
 */
public class CollectionsEx {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    // list.sort(Comparator.reverseOrder()); List 자체 정렬 메소드
    System.out.println("rotate() 전 : " + list);
    /**
     * 오른쪽 두칸씩 이동
     */
    Collections.rotate(list, 2);
    System.out.println("rotate() 후 : " + list);

    Collections.swap(list, 0, 2);
    System.out.println(list);

    // Collections 가 모아놓은 정렬 메소드
    // Collections.sort(list, Collections.reverseOrder());
    Collections.sort(list, Comparator.naturalOrder());
    System.out.println(list);
    /**
     * binarySearch() : 이진 검색 (전제조건 : 오름차순 정렬된상태)
     *                  값이 없으면 음수로 결과가 나옴
     */
    System.out.println(
      "3이 저장된 위치 찾기 : " + Collections.binarySearch(list, 3)
    );

    System.out.println("최대값 : " + Collections.max(list));
    System.out.println("최소값 : " + Collections.min(list));

    // list 를 하나의 값으로 채울 때
    Collections.fill(list, 9);
    System.out.println(list);
  }
}
