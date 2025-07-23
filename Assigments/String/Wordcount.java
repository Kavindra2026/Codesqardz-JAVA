// import java.util.Scanner;

// public class Wordcount {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a String:");
//     String input = sc.nextLine();

//     int count = 0;
//     input = input.trim();

//     if (!input.isEmpty()) {
//       count = 1;
//       for (int i = 0; i < input.length(); i++) {
//         if (input.charAt(i) == ' ') {
//           count++;
//         }
//       }
//     }

//     System.out.println("Word Count: " + count);
//   }
// }


import java.util.Scanner;

public class Wordcount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String input = sc.nextLine();

    // Remove leading and trailing spaces
    input = input.trim();

    // Check if input is empty
    if (input.isEmpty()) {
      System.out.println("Word Count: 0");
    } else {
      // Split by one or more spaces
      String[] words = input.split(" +");
      System.out.println("Word Count: " + words.length);
    }

  }
}
