import java.util.Scanner;

// done
public class q13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // First Matrix Input
    System.out.print("Enter row 1st Matrix");
    int row = sc.nextInt();
    System.out.print("Enter col 1st Matrix");
    int col = sc.nextInt();

    System.out.println("Enter the First Matrix Element");
    int A[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    // Second Matrix Input
    System.out.print("Enter row 2nd Matrix");
    int row2 = sc.nextInt();
    System.out.print("Enter col 2nd Matrix");
    int col2 = sc.nextInt();

    System.out.println("Enter the Secon Matrix Element");
    int B[][] = new int[row2][col2];
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) {
        B[i][j] = sc.nextInt();
      }
    }

    // Chech Condition
    if (row != row2 || col != col2) {
      System.out.println("Invalid Input");
      return;
    }

    // Matrix Sum
    int sum[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum[i][j] += A[i][j] + B[i][j];
      }
    }
    // Display the sum of Matrix
    System.out.println("Sum of the matrix:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}
