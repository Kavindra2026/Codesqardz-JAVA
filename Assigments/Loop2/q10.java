import java.util.Scanner;

public class q10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char choice;

    do {

      System.out.print("Enter first number: ");
      int num1 = sc.nextInt();

      System.out.print("Enter second number: ");
      int num2 = sc.nextInt();

      int sum = num1 + num2;
      System.out.println("Sum = " + sum);

      System.out.print("Do you want to perform the operation again? (Y/N): ");
      choice = sc.next().charAt(0);

    } while (choice == 'Y' || choice == 'y');

    System.out.println("Program terminated.");
  }
}
