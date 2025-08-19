public class FunOver {

  static void show() {
    System.out.println("Zero Argument");
  }

  static void show(int x) {
    System.out.println("One argument");
  }

  static void show(int x, int y) {
    System.out.println("two argument");
  }

  static void show(int x, int y, int z) {
    System.out.println("Three argument");
  }

  public static void main(String[] args) {
    show();
    show(10);
    show(10, 10);
    show(10, 10, 10);
  }
}
