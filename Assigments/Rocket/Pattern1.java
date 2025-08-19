
class Pattern1 {
  public static void main(String[] args) {
    int i, j, n, sp;
    System.out.print("Enter the size : ");

    n = new java.util.Scanner(System.in).nextInt();

    sp = 0;
    for (i = 0; i < 2 * n; i++) {
      if (i < n) {
        System.out.printf("@");
        for (j = 0; j < sp; j++) {
          System.out.print(" ");
        }
        for (j = 0; j < n; j++) {
          System.out.printf("*");
        }
        sp = sp + n - 1;

        if (i + 1 == n) {
          System.out.printf("@");
          sp++;
        }

      } else if (i == n) {
        System.out.printf("@");
        for (j = 0; j < sp; j++) {
          System.out.printf(" ");

        }
        System.out.print("@");
      } else {

        for (j = 0; j < sp+1; j++) {
          System.out.printf(" ");
        }
        System.out.printf("@");

      }
      System.out.print("\n");

    }

  }
}