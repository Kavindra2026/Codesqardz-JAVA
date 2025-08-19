import java.util.Scanner;

public class SumOfEven_Odd {
  void EvenOdd() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbers ");
    int count = sc.nextInt();

    int Evensum = 0;
    int Oddsum = 0;
    for (int i = 1; i <= count; i++) {
      System.out.print("Enter number " + i + ": ");
      int num = sc.nextInt();

      if (num % 2 == 0) {
        Evensum += num;
      } else {
        Oddsum += num;
      }
    }
    System.out.println(Evensum);
    System.out.println(Oddsum);
  }

  public static void main(String[] args) {
    SumOfEven_Odd e = new SumOfEven_Odd();
    e.EvenOdd();
  }

}
