class Exception {
  public static void main(String[] args) {
    try {
      int a = 10 / 0;
      System.out.println(a);

    } catch (ArithmeticException e) {
      System.out.println("AE Exception");
    }
  }
}