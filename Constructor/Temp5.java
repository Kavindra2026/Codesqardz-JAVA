// Copy Constructor

public class Temp5 {

  int x, y;

  Temp5(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Temp5(Temp5 z) {

    this.x = z.x;
    this.y = z.y;
  }

  void show() {

    System.out.print(x + " ");
    System.out.println(y);

  }

  public static void main(String[] args) {
    Temp5 t1 = new Temp5(10, 20);
    t1.show();
    Temp5 t2 = new Temp5(t1);
    t2.show();
  }

}
