public class Fish extends Animal implements Pet {
    private String name;
  
    public Fish() {
      super(0);
    }
  
    @Override
    public String getName() {
      return name;
    }
  
    @Override
    public void setName(String name) {
      this.name = name;
    }
  
    @Override
    public void play() {
      // implementasi method play
      System.out.println("Ikan sedang bermain");
    }
  
    @Override
    public void eat() {
      // implementasi method eat
      System.out.println("Ikan sedang makan");
    }
  
    @Override
    public void walk() {
      System.out.println("Ikan ini tidak berjalan, tapi berenang");
    }
  }
  