package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map 인터페이스
 * - key, value 를 하나의 쌍으로 묶어서 저장
 * - key는 중복 불가, value는 중복 가능
 * - 내부 인터페이스 Map.Entry
 *
 * - 구현 클래스 : Hashtable, HashMap, TreeMap ...
 */

public class MapEx1 {

  public static void main(String[] args) {
    /**
     * Map<key,value>
     */
    Map<String, String> map = new HashMap<>();

    /**
     * put() : 요소 추가
     */
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    System.out.println(
      "key 에 해당하는 value 가져오기 get() : " + map.get("id_0125")
    );
    System.out.println(
      "key 존재여부 containsKey() : " + map.containsKey("id_0125")
    );
    System.out.println(
      "value 존재여부 containsValue() : " + map.containsValue("송중기")
    );
    System.out.println("Map 요소 크기 size() : " + map.size());
    System.out.println("Map 요소 삭제 remove() : " + map.remove("id_0126"));

    /**
     * key 값 모두 가져오기
     * Set 타입으로 돌려줌
     */
    Set<String> keys = map.keySet();
    System.out.println(keys);

    /**
     * value 값 모두 가져오기
     * Collection 타입으로 돌려줌
     */
    Collection<String> values = map.values();
    System.out.println(values);
  }
}
