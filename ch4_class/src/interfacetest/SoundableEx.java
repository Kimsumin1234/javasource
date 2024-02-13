package interfacetest;

public class SoundableEx {

  public static void main(String[] args) {
    // printSound(new Cat());
    Cat cat = new Cat();
    printSound(cat);

    printSound(new Dog());
  }

  public static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }
}
