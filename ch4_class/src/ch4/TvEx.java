package ch4;

public class TvEx {

  public static void main(String[] args) {
    // 생성자 호출
    Tv tv = new Tv("black", 3, true); // new ~ : 객체생성
    // System.out.println(tv.color); // null
    // System.out.println(tv.channel); // 0
    // System.out.println(tv.power); // false

    // tv.color = "black";
    // tv.channel = 3;
    // tv.power = true; // true => on

    tv.channelUp(); // Tv 클래스에서 void메소드 로 값을 변경할수있게 설정함
    // System.out.println("현재 채널 " + tv.channel); // 현재 채널 +1 된 상태
    System.out.println("현재 채널 " + tv.getChannel());

    // 채널 번호 직접 입력
    tv.setChannel(45); // void 타입이기 때문에 메소드 호출만 하면된다
    System.out.println("현재 채널 " + tv.getChannel()); // 리턴타입 인 메소드를 출력

    // 전원 끄기
    tv.setPower(false);
  }
}
