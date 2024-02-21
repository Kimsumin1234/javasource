package generics;

/*
 * 제한된 지네릭 클래스
 *  - <T extends Fruit> : 특정 타입과 그 타입의 자손들만 대입 가능 (Fruit와  Fruit를 상속받고 있는 클래스만 들어올수있다)
 *  - <? super T>  : 특정 타입과 그 타입의 부모들만 대입 가능 (와일드 카드)
 *
 *  - sort(List<T> list, Comparator<? super T> c)
 *  - sort(List<Apple> list, Comparator<? supper Apple> c)
 *   : Comparator<Apple>, Comparator<Fruit>, Comparator<Object>
 *
 *  - sort(List<Toy> list, Comparator<? supper Toy> c)
 *   : Comparator<Toy>,  Comparator<Object>
 */
public class FruitBox<T extends Fruit> extends Box3<T> {}
