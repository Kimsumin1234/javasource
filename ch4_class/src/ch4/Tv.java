package ch4;

// 멤버변수 초기값

// String : null
// int,long : 0
// float,dpuble : 0
// char : ' '
// bollean : false

// 클래스 : 설계도
// 객체 : 실제 존재하는것

public class Tv {

  // 색상(검정,흰색), 전원상태(on,off), 채널(6,7,...), 볼륨(13,14,...), 크기(50,46,..)...
  // 멤버변수
  // private - 멤버변수에만 사용
  private String color;
  private int channel;
  private boolean power;

  void channelUp() {
    channel++;
  }

  void channelDown() {
    channel--;
  }

  // 생성자
  // Tv(){}
  // 생성자 만들기 마우스 우클릭 -> Source Ation -> Constructor

  public Tv() {}

  // 생성자 오버로딩
  // 로컬변수
  public Tv(String color, int channel, boolean power) {
    this.color = color; // 로컬변수에 어떤값이 들어오면 멤버변수에 대입해줘
    this.channel = channel;
    this.power = power;
  }

  // 마우스 우클릭 -> Source Action -> Getter and Setter
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }
}
