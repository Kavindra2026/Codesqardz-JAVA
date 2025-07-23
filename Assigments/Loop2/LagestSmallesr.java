import java.util.Scanner;

public class LagestSmallesr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    char choice;

    do {
      System.out.print("Enter a number: ");
      number = sc.nextInt();

      if (number > largest) {
        largest = number;
      }

      if (number < smallest) {
        smallest = number;
      }

      System.out.print("Do you want to enter another number? (y/n): ");
      choice = sc.next().charAt(0);

    } while (choice == 'y' || choice == 'Y');

    System.out.println("Largest number: " + largest);
    System.out.println("Smallest number: " + smallest);
  }

}
