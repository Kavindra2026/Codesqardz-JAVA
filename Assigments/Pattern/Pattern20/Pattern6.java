public class Pattern6 {

  public static void main(String[] args) {

    int n = 7;
    for (int i = n; i >= 1; i--) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");

      }
      for (int j = 1; j <= i; j++) {

        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 2; i <= n; i++) {
      for (int j = n - 1; j >= i; j--) {
        System.out.print(" ");

      }
      for (int j = 1; j <= i; j++) {

        System.out.print("* ");
      }
      System.out.println();

    }
  }

}
