import java.util.Scanner;

// done
public class q12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row of Matrix : ");
    int row = sc.nextInt();
    System.out.print("Enter the col of Matrix  : ");
    int col = sc.nextInt();
    int A[][] = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        A[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(A[j][i] + " ");
      }
      System.out.println();
    }
  }
}