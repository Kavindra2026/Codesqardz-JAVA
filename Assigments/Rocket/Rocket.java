
import java.util.Scanner;

public class Rocket {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the any number");
    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {
      if (i % 2 == 0) {

        for (int j = 0; j <= n - i; j++) {
          System.out.print(" ");
        }

        for (int j = 0; j <= i; j++) {

          System.out.print("* ");

        }
        System.out.println();
      }
    }

    for (int i = 0; i <= n - 3; i++) {
      for (int j = 0; j <= n; j++) {
        if (j == 1 || j == n) {
          System.out.print("@ ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    for (int i = n; i >= 0; i--) {
      if (i % 2 == 0) {
        for (int j = 0; j <= n - i; j++) {
          System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
    for (int i = n; i >= 0; i--) {
      if (i % 2 == 0) {
        for (int j = 0; j <= n - i; j++) {
          System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }
}

// *
// * * *
// * * * * *