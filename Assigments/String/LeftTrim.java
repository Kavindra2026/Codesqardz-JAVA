import java.util.Scanner;

public class LeftTrim {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    int index = 0;

    // Find first non-space character
    while (index < input.length() && input.charAt(index) == ' ') {
      index++;
    }

    // Trim from first non-space character to end
    String result = input.substring(index);

    System.out.println("After Left Trim: '" + result + "'");
 
  }
}
