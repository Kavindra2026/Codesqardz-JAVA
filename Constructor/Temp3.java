// Parameterized Constructor

public class Temp3 {
  int x;
  int y;

  Temp3(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void show() {
    System.out.println(x);
    System.out.println(y);
  }

  public static void main(String[] args) {
    Temp3 t = new Temp3(10, 20);
    t.show();
    Temp3 t2 = new Temp3(30, 40);
    t2.show();
  }
}
