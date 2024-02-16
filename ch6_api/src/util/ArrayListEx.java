package util;

import static java.lang.Math.negateExact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * ★★★ 자료구조 ★★★
 * 컬렉션 프레임워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계
 *                   여러개의 데이터를 잘 담고 잘 표준화하는 방법
 *   Collection
 *
 *   List   Set    : Collection 인터페이스 상속
 *
 *       Map       : 단독
 *
 *  List(인터페이스) : 순서가 있는 데이터의 집합 (데이터의 중복 허용)
 *       구현 클래스 : ArrayList, LinkedList, Stack, Vector, ...
 *       고정크기 -> 크기 변경이 필요하다면 내부적으로 알아서 처리해줌 (배열 보다 편한점)
 *                  ==> 배열과 동일한 개념
 *                      배열은 고정크기 -> 크기 변경 시 다른 배열 생성 후 옮겨야함
 */
public class ArrayListEx {

  public static void main(String[] args) {
    /**
     * inital capacity : 10 (내부적으로 10개가 기본으로 되있다)
     *
     * List<객체> : 데이터를 담을때 어떤걸 담을지 미리 알려줘야함
     * 차례대로 데이터가 담김
     * List<Integer> list = new ArrayList<>(20); (부모=자식 형태)
     *
     * add() : append 개념
     */
    ArrayList<Integer> list = new ArrayList<>(20);
    list.add(75);
    list.add(68);
    list.add(35);
    list.add(45);
    list.add(55);
    list.add(65);

    /**
     * toString() 오버라이딩 여부
     * [15, 25, 35, 45, 55, 65] 오버라이딩 됨
     */
    System.out.println(list.toString());
    // list.sort(Comparator.reverseOrder());
    list.sort(Comparator.naturalOrder());
    System.out.println(list.toString());

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("Java");
    list2.add("JSP");
    list2.add("HTML");
    list2.add("CSS");
    list2.add("JAVA SCRIPT");
    list2.add("Python");

    /**
     * 메소드
     * add()  : append 개념
     * size() : ArrayList 에 저장된 객체 개수 를 알려준다  /  배열은 length()
     * get()  : 지정된 위치에 있는 객체 반환  /  arr[3]
     * indexOf() : 지정된 객체가 저장된 위치 반환 (없으면 -1)
     * remove() : 지정된 객체 제거 (Object:제거했으면 true 반환, index:제거되는 객체반환)
     * isEmpty() : ArrayList 가 비어 있는지 확인
     * set()  : 특정 위치에 객체 추가 (중간 삽입) -> 추가와 삽입이 빈번히 발생하면 메모리를 많이 잡아먹는다
     * sort(Comparator.reverseOrder()) : 내림차순
     * sort(Comparator.naturalOrder()) : 오름차순
     */
    System.out.println("size() : " + list2.size());
    System.out.println("get() : " + list2.get(3));
    System.out.println("indexOf () : " + list2.indexOf("JAVA"));
    System.out.println("remove() : " + list2.remove("Java"));
    System.out.println("remove() : " + list2);
    System.out.println("remove() : " + list2.remove(2));
    System.out.println("remove() : " + list2);
    System.out.println("isEmpty() : " + list2.isEmpty());
    list2.set(1, "Oracle");
    System.out.println("set() : " + list2);

    /**
     * ArrayList ==> 배열로 변환
     * 리턴이 Object[] 로 되있다
     * Object 타입은 모든 타입을 다 받을수있다
     */
    Object[] arr = list2.toArray();
    for (Object object : arr) {
      System.out.println(object);
    }

    /**
     * 배열 ==> ArrayList 변환
     * Arrays 클래스 : 배열과 관련된 작업을 할때 사용
     * 리턴은 마우스 올리면 설명에 나온다 그걸로 담으면된다
     */
    int[] arr2 = { 3, 5, 6, 7, 9 };
    List<int[]> list3 = Arrays.asList(arr2);
  }
}
