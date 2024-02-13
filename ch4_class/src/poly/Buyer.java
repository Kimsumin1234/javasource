package poly;

public class Buyer {

  int money = 1000; // 소유금액
  int bounusPoint = 0;

  //   void buy(Tv tv) {
  //     if (money < tv.price) {
  //       System.out.println("잔액이 부족하여 물건 구매 불가");
  //       return;
  //     }
  //     money -= tv.price;
  //     bounusPoint += tv.bounusPoint;
  //     System.out.println(tv + " 제품을 구매하셨습니다.");
  //   }

  // 다형성 (상속관계 일경우)(왼쪽부모 = 오른쪽자식 형태)
  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 물건 구매 불가");
      return;
    }
    money -= p.price;
    bounusPoint += p.bounusPoint;
    System.out.println(p + " 제품을 구매하셨습니다.");
  }
}
