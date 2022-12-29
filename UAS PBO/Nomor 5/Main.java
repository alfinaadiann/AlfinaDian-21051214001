public class Main {
    public static void main(String[] args) {
      Fish f = new Fish();
      Cat c = new Cat("Hehe");
      Animal a = new Fish();
      Animal s = new Spider();
      Pet p = new Cat();

      //spider
      s.eat();
      s.walk();
      System.out.println("==============================");

      //cat
      c.getName();
      c.play();
      c.eat();
      c.walk();
      System.out.println("==============================");

      //fish
      f.setName("Hoho");
      f.play();
      f.walk();
      f.eat();
      System.out.println("==============================");

    }
  }
  