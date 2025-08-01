import java.util.Scanner;

class Prime {

  void checkPrime(int num) {
    int count = 0;

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }

    if (count == 2) {
      System.out.println(num + " is a Prime Number.");
    } else {
      System.out.println(num + " is Not a Prime Number.");
    }
  }
}

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int num = sc.nextInt();
    Prime p = new Prime();
    p.checkPrime(num);
  }
}
