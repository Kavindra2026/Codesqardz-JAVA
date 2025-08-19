public class assingnment3 {
  public static void main(String[] args) {
    for (int i = 0; i <= 8; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);

      }

      for (int j = 8; j >= i; j--) {
        System.out.print(" ");

      }

      for (int j = i; j >= 1; j--) {
        System.out.print(j);

      }
      System.out.println();

    }

  }
}