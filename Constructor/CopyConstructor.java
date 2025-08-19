// Copy Constructor

public class CopyConstructor {

  int x, y;

  CopyConstructor(int x, int y) {
    this.x = x;
    this.y = y;
  }

  CopyConstructor(CopyConstructor z) {

    this.x = z.x;
    this.y = z.y;
  }

  void show() {

    System.out.print(x + " ");
    System.out.println(y);

  }

  public static void main(String[] args) {
    CopyConstructor t1 = new CopyConstructor(10, 20);
    t1.show();
    CopyConstructor t2 = new CopyConstructor(t1);
    t2.show();
  }

}
