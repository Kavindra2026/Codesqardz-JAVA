import java.util.Scanner;

// Done
public class q11 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input for first matrices
    System.out.print("Enter rows A matrix :  ");
    int row = sc.nextInt();
    System.out.print("Enter col A matrix :  ");
    int col = sc.nextInt();
    int A[][] = new int[row][col];

    System.out.println("Enter elements of Matrix A:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    // Input for second matrix
    System.out.print("Enter row Matrix B: ");
    int row2 = sc.nextInt();
    System.out.print("Enter col Matrix B: ");
    int col2 = sc.nextInt();
    int[][] B = new int[row2][col2];

    System.out.println("Enter elements of Matrix B:");
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) {
        B[i][j] = sc.nextInt();
      }
    }

    // Multiplle in matrix in
    int pro[][] = new int[row][col2];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col2; j++) {
        for (int k = 0; k < col; k++) {
          pro[i][j] += A[i][k] * B[k][j];
        }
      }
      System.out.println();
    }

    /// Print the Matrix

    System.out.println("Product of matrices:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col2; j++) {
        System.out.print(pro[i][j] + " ");
      }
      System.out.println();
    }

  }
}
