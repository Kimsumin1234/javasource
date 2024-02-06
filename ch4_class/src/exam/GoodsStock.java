package exam;

public class GoodsStock {

  // 속성-상품코드(p1011), 재고수량(300)
  private String goodsCode;
  private int stockNum;

  // 생성자
  public GoodsStock() {
    // default 생성자 괄호안이 비어있는 생성자
  }

  public GoodsStock(String goodsCode, int stockNum) {
    this.goodsCode = goodsCode;
    this.stockNum = stockNum;
  }

  // 재고수량 추가 메소드 addStock(int amount)
  // 재고수량 리턴
  int addStock(int amount) {
    stockNum += amount;
    return stockNum;
  }

  // 재고수량 감소 메소드 subtrackStock(int amount)
  // 재고수량 리턴
  int subtrackStock(int amount) {
    stockNum -= amount;
    return stockNum;
  }
}
