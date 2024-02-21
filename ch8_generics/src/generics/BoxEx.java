package generics;

public class BoxEx {

  public static void main(String[] args) {
    Box box = new Box();

    box.setItem(new String("홍길동"));
    // 아무거나 담긴하지만 꺼낼때 형변환을 해줘야 한다
    // 이렇게 담으면 매번 꺼낼때 타입체크를 해줘야 한다
    String name = (String) box.getItem();

    box.setItem(Integer.valueOf(10));
    Integer i = (Integer) box.getItem();

    box.setItem(Float.valueOf(3.14f));
    Float f = (Float) box.getItem();

    // Box2<어떤걸 담을지 먼저 선언>
    // 먼저 선언 했기떄문에 따로 타입을 체크할 필요가 없다
    Box2<String> box2 = new Box2<>();

    box2.setItem("홍길동");
    box2.setItem("김유신");

    String str = box2.getItem();

    Box2<Integer> box3 = new Box2<>();
    Box2<Float> box4 = new Box2<>();
    Box2<Double> box5 = new Box2<>();

    Box3<Fruit> fruitBox = new Box3<>();
    Box3<Apple> appleBox = new Box3<>();
    Box3<Grape> grapeBox = new Box3<>();
    Box3<Toy> toyBox = new Box3<>();

    /**
     * 부모 타입으로 설정시 자식 객체를 담는 것 허용
     */
    fruitBox.add(new Fruit());
    fruitBox.add(new Apple());
    fruitBox.add(new Grape());
    // fruitBox.add(new Toy());

    appleBox.add(new Apple());
    // appleBox.add(new Fruit());
    // appleBox.add(new Grape());
    // appleBox.add(new Toy());

    grapeBox.add(new Grape());

    toyBox.add(new Toy());

    FruitBox<Fruit> fruitBox2 = new FruitBox<>();
    fruitBox2.add(new Fruit());
    fruitBox2.add(new Apple());
    fruitBox2.add(new Grape());
    // fruitBox2.add(new Toy());

    System.out.println(Juicer.makeJuice(fruitBox2));
  }
}
