public class pattern10 {

  public static void main(String[] args) {
    int n = 5;
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }

}
