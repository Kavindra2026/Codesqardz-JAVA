import java.util.Scanner;

public class NaturalAlgorithim {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of terms (n): ");
    int n = sc.nextInt();

    double sum = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum -= 1.0 / i;
        sum += 1.0 / i;
      }
    }

    System.out.println("Natral Algorithim: " + sum);

  }
}
