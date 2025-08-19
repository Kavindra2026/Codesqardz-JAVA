import java.util.Scanner;

public class ChangeCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    String result = "";

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch + 32);
      }
      result = result + ch;
    }
    System.out.println("Changed case string: " + result);
    sc.close();
  }
}