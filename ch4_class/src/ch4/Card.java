package ch4;

public class Card {

  private String kind; // 무늬(하트,클로버,...)
  private int number; // 숫자

  // 클래스변수 (static) : 공유
  static int width = 100;
  static int height = 150;

  public Card(String kind, int number) {
    this.kind = kind;
    this.number = number;
  }
}
