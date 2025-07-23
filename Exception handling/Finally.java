class Finally {
  static int show() {
    // System.exit(0);
    try {
      int x = 10 / 0;
      return 20;
    } catch (NullPointerException e) {
      System.out.println(e);
    } finally {
      return 4000;
    }
  }

  public static void main(String[] x) {
    int z = show();
    System.out.println(z);
  }

}
