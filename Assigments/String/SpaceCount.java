import java.util.Scanner;

public class SpaceCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String input = sc.nextLine();
    int countspace = 0;
    for (int i = 0; i < input.length(); ++i) {
      if (input.charAt(i) == ' ') {
        countspace++;
      }
    }

    System.out.println("Count Space: " + countspace);
  }
}
