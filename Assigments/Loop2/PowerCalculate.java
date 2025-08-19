import java.util.Scanner;

public class PowerCalculate {
  void calculate() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base number: ");
    int n = sc.nextInt();
    System.out.print("Enter the exponent: ");
    int exponent = sc.nextInt();

    int result = 1;
    for (int i = 1; i <= exponent; i++) {
      result = result * n;
    }
    System.out.println("Base " + n + "  exponent " + exponent + " = " + result);
  }

  public static void main(String[] args) {
    PowerCalculate p = new PowerCalculate();
    p.calculate();
  }
}
