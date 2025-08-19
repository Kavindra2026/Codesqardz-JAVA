import java.util.Scanner;

public class Pattern7 {
  public static void main(String[] args) {
    int arm = 0, a, d, no;
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any number: ");
    no = sc.nextInt();
    d = no;

    while (no > 0) {
      a = no % 10; // Get last digit
      no = no / 10; // Remove last digit
      arm = arm + a * a * a; // Add cube of the digit
    }

    if (arm == d) {
      System.out.println("Armstrong number");
    } else {
      System.out.println("Not Armstrong number");
    }
  }
}
