import java.util.Scanner;

public class FindLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int count = 0;
    // Convert the string to a character array
    for (char c : str.toCharArray()) {
      count++;
    }

    System.out.println("Length of the string: " + count);
  }
}
