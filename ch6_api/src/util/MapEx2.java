package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("myId", "1234");
    map.put("asdf", "1111");
    map.put("asdf", "1234");

    Set<String> keys = map.keySet();
    System.out.println(keys);

    /**
     * key 가 중복일 경우 나중에 입력한 값이 저장이된다
     */
    Collection<String> values = map.values();
    System.out.println(values);

    Scanner sc = new Scanner(System.in);

    /**
     * 아이디와 비밀번호를 입력 받아서 Map 에 들어 있는지 확인
     */
    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요.");
      System.out.print("아이디 >>> ");
      String id = sc.nextLine().trim();
      System.out.print("비밀번호 >>> ");
      String password = sc.nextLine().trim();

      /**
       * key 값 중 아이디와 일치하는지 확인
       */
      if (!map.containsKey(id)) {
        System.out.println(
          "입력하신 id는 존재하지 않습니다. 다시 입력해주세요."
        );
        continue;
      } else {
        /**
         * value 값 중 비밀번호와 일치하는지 확인
         * 일치한다면 while 문 종료
         * 일치하지 않는다면 다시 입력
         */
        if (!map.get(id).equals(password)) {
          System.out.println("잘못된 비밀번호 입니다. 다시입력해주세요.");
          continue;
        }
        System.out.println("아이디와 비밀번호는 일치합니다");
        break;
      }
    }
  }
}
