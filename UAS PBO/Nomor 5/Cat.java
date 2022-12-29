public class Cat extends Animal implements Pet {
    private String name;
  
    public Cat(String name) {
      super(4);
      this.name = name;
    }
  
    public Cat() {
      this("");
    }
  
    @Override
    public String getName() {
      System.out.println("Nama kucing ini adalah "+name);
      return name;
    }
  
    @Override
    public void setName(String name) {
      this.name = name;
    }
  
    @Override
    public void play() {
      // implementasi method play
      System.out.println("Kucing sedang bermain");
    }
  
    @Override
    public void eat() {
      // implementasi method eat
      System.out.println("Kucing sedang makan");
    }
  }