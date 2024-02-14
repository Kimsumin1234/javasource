package shop;

public class CellPhone extends Product {

  public CellPhone(String pname, int price, String carrier) {
    super(pname, price);
    this.carrier = carrier;
  }

  private String carrier;

  @Override
  public void printExtra() {
    System.out.println("    통신사 : " + carrier);
  }
}
