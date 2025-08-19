public class Temp {
  int x;
  int y;

  Temp() {
    x = 10;
    y = 20;
  }

  void show() {
    System.out.println(x);
    System.out.println(y);
  }

  public static void main(String[] args) {
    Temp t = new Temp();
    t.show();
    Temp t1 = new Temp();
  }
}
