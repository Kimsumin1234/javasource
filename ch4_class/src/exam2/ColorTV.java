package exam2;

public class ColorTV extends TV {

  public ColorTV(int size, int color) {
    super(size);
    this.color = color;
  }

  private int color;

  public int getColor() {
    return color;
  }

  public void printProperty() {
    System.out.println(getSize() + "인치" + " " + color + "컬러");
  }
}
