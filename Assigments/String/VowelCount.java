import java.util.Scanner;

public class VowelCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();
    int count = 0;

    input = input.toLowerCase();
    
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
    System.out.println("Number of vowels: " + count);
  }
}
