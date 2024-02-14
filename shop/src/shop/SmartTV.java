package shop;

public class SmartTV extends Product {

  public SmartTV(String pname, int price, String resolution) {
    super(pname, price);
    this.resolution = resolution;
  }

  private String resolution;

  @Override
  public void printExtra() {
    System.out.println("    해상도 : " + resolution);
  }
}
