public class GenMethDemo1 {

  static <T extends Number> double add(T x, T y) {

    double d = x.doubleValue() + y.doubleValue();
    return d;
  }

  public static void main(String args[]) {
    // Use isIn() on Integers.
    System.out.println(add(10, 20));
    System.out.println(add(10.5f, 20.5f));
    System.out.println(add(10.5, 20.5));
    System.out.println(add(1001, 2001));
  }
}