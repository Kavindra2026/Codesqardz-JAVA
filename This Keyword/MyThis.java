class MyThis {
  int x = 100;

  void get(MyThis this, int x) {
    System.out.println(this + "get");
    System.out.println(this.x);
    System.out.println(x);
  }

  void show() {
    System.out.println("show");
  }

  public static void main(String[] args) {
    MyThis mt = new MyThis();
    System.out.println(mt + "   main");
    mt.get(300);
  }

}