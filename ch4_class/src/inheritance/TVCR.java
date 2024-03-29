package inheritance;

// 관계 : 1.상속    2.포함

// TV+VCR

public class TVCR extends Tv {

  // 포함 관계
  VCR vcr = new VCR();
  int counter = vcr.counter;

  void play() {
    vcr.play();
  }

  void stop() {
    vcr.stop();
  }
}
