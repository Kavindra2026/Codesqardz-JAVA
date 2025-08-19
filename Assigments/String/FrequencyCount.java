import java.util.Scanner;

public class FrequencyCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    System.out.println("Character Frequencies in order:");

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);

      // Process only first occurrence
      if (str.indexOf(currentChar) == i) {
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
          if (str.charAt(j) == currentChar) {
            count++;
          }
        }

        System.out.println(currentChar + " = " + count);
      }
    }
  }
}
