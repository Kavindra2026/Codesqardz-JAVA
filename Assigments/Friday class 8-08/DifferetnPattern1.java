
import java.util.Scanner;

public class DifferetnPattern1 {

    public static void main(String[] args) {
        int n, i, j, k, l, m, p, q, r, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr the n value ");
        n = sc.nextInt();
        p = n;
        q = n;
        for (i = n; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (k = p * 2; k < n * 2; k++) {
                System.out.print(" ");
            }
            for (l = i; l != 0; l--) {

                if (l == n) {
                    continue;
                }
                System.out.print("*");

            }
            p--;
            System.out.println();
        }

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (k = q * 2 - 2; k > 1; k--) {
                System.out.print(" ");

            }
            for (m = i; m != 0; m--) {
                if (m == n) {
                    continue;
                }
                System.out.print("*");

            }
            System.out.println();
            q--;

        }

    }
}
