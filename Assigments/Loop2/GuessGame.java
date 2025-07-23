import java.util.Random;
import java.util.Scanner;

public class GuessGame {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    int randomNumber = r.nextInt(100) + 1;
    int guess = 0;

    System.out.println("Guess a number between 1 and 100:");

    while (guess != randomNumber) {
      System.out.print("Enter your guess: ");
      guess = sc.nextInt();

      if (guess > randomNumber) {
        System.out.println("Too high, try again.");
      } else if (guess < randomNumber) {
        System.out.println("Too low, try again.");
      } else {
        System.out.println("You guessed the correct number.");
      }
    }
  }
}
