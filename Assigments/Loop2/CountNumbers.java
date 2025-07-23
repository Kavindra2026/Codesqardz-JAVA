import java.util.Scanner;

public class CountNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int pos = 0, neg = 0, zero = 0;
   char choice;

    do {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();

      if (num > 0)
        pos++;
      else if (num < 0)
        neg++;
      else
        zero++;

      System.out.print("Do you want to continue? (y/n): ");
       choice= sc.next().charAt(0);

    } while (choice == 'y' || choice == 'Y');

    System.out.println("Positive: " + pos);
    System.out.println("Negative: " + neg);
    System.out.println("Zero: " + zero);
  }
}
