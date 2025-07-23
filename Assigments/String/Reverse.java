import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    String reversed = "";

    for (int i = input.length(); i >= 0; i--) {
      reversed = reversed + input.charAt(i);
    }

    System.out.println("Reversed string: " + reversed);
  }
}
