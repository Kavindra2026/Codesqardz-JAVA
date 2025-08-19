import java.util.Scanner;

public class Factorial {
  void fact() {
    int Fact = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Factorial");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      Fact *= i;
    }
    System.out.println(Fact);
  }

  public static void main(String[] args) {
    Factorial f = new Factorial();
    f.fact();
  }
}
