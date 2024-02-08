package inheritance;

public class CaptionTv extends Tv {

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  boolean caption;

  void displayCaption(String text) {
    // if(caption != true) == if(!caption) 동일

    if (caption) { // if(caption == true) 동일
      System.out.println(text);
    }
  }
}
