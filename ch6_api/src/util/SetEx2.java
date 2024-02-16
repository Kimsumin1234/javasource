package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < 6; i++) {
      /**
       * 1~45 사의의 숫자를 임의로 생성
       * Set은 중복된 숫자가 나오면 출력이 안된다
       */
      int num = (int) (Math.random() * 45) + 1;
      set.add(num);
    }
    System.out.println(set);
    /**
     * Set 정렬하기
     * Set => List
     * 부모가 같기때문에 변환가능
     */
    List<Integer> list = new ArrayList<>(set);
    list.sort(Comparator.naturalOrder());
    System.out.println(list);
    /**
     * List 중복값 안나오게 하기
     * List => Set
     */
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(35);
    list2.add(45);
    list2.add(55);
    list2.add(55);
    Set<Integer> set2 = new HashSet<>(list2);
    System.out.println(set2);
    /**
     * 중복을 판별하기 위한 코드 필요
     * Set 이 그냥 해주는게 아니라 Member 클래스에 판별코드가 있어야한다
     * Member 는 본인이 새로 만든 클래스이기 때문에
     * equals(), hashCode() 오버라이딩 해야함
     */
    Set<Member> set3 = new HashSet<>();

    Member member = new Member();
    member.setId("hong123");
    member.setName("홍길동");
    set3.add(member);

    member = new Member();
    member.setId("hong123");
    member.setName("홍길동");
    set3.add(member);

    for (Member mem : set3) {
      System.out.println(mem);
    }
  }
}
