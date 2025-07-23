
import java.util.Scanner;

public class ReverseDigit {
  void reverse() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    ReverseDigit r = new ReverseDigit();
    r.reverse();

  }

}
