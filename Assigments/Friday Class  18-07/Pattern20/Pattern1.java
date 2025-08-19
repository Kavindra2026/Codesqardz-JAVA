public class Pattern1 {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      // space print
      for (int j = n; j >= i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
      // space print
      for (int j = n; j >= i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
