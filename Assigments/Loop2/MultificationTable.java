import java.util.Scanner;

class MultificationTable {
  void Table() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number Table : ");
    int n = sc.nextInt();
    for (int i = 1; i <= 10; i++) {

      int table = n * i;
      System.out.println(n + " x " + i + " = " + table);

    }
  }

  public static void main(String[] args) {
    MultificationTable m = new MultificationTable();
    m.Table();
  }
}
