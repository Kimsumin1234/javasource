package exam2;

public class IPTV extends ColorTV {

  public IPTV(int size, int color, String ip) {
    super(size, color);
    this.ip = ip;
  }

  private String ip;

  public String getIp() {
    return ip;
  }

  @Override
  public void printProperty() {
    System.out.println(
      "나의 IPTV는 " +
      ip +
      " 주소의 " +
      getSize() +
      "인치" +
      " " +
      getColor() +
      "컬러"
    );
  }
}
