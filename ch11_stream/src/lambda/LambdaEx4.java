package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 컬렉션 프레임워크(java.util)의 함수형 인터페이스를 매개변수로 사용하는 메소드가 존재
 */
public class LambdaEx4 {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add(i);
    }
    /**
     * list 값을 사용
     * for(int i=0, i<list.size(), i++)
     * for(int i : list)
     * forEach(Consumer<? super T> action)
     *
     * forEach(Consumer<? super T> action)
     * Consumer<? super T> => Consumer<Integer super Object> => Consumer<Integer> c => ( ) -> { }; 일
     */
    list.forEach(i -> System.out.println(i));

    /**
     * removeIf(Predicate<? super E> filter)
     * list 에서 2 또는 3 배수 제거
     */

    // list.forEach(i -> {
    //   if (i % 2 == 0 || i % 3 == 0) {
    //     list.remove(i);
    //   }
    // });

    // for (Integer i : list) {
    //   if (i % 2 == 0 || i % 3 == 0) {
    //     list.remove(i);
    //   }
    // }

    list.removeIf(i2 -> i2 % 2 == 0 || i2 % 3 == 0);

    /**
     * list의 각 요소에 10을 곱한다
     */
    list.replaceAll(i -> i * 10);
    System.out.println("각요소 10곱하기 : " + list);

    /**
     * Map
     * map 의 모든 요소를 {key, value} 출력
     */
    Map<String, String> map = new HashMap<>();
    map.put("1", "1");
    map.put("2", "2");
    map.put("3", "3");
    map.put("4", "4");

    map.forEach((k, v) -> System.out.printf("{%s, %s}\n", k, v));
  }
}
