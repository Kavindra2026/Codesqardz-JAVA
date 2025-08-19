import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int a = sc.nextInt();

    System.out.print("Enter second number: ");
    int b = sc.nextInt();

    int hcf = 1;

    int min = (a < b) ? a : b;

    for (int i = 1; i <= min; i++) {
      if (a % i == 0 && b % i == 0) {
        hcf = i;
      }
    }
    System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
  }
}
