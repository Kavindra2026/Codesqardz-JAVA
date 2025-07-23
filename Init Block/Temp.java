class Temp {
  int x;
  {
    System.out.println("int Block");
    this.x = 10;
  }

  public Temp() {
    System.out.println("default");
    System.out.println(x);
  }

  {
    System.out.println("second");
  }

  Temp(int x) {
    System.out.println(x);
  }

  public static void main(String[] args) {
    new Temp();
    new Temp(10);
    new Temp();
  }
}