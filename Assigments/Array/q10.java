public class q10 {
  // Done

  public static void main(String[] args) {
    int row = 2, col = 3;

    int x[][] = { { 2, 3, 4 }, { 5, 2, 3 } };
    int y[][] = { { -4, 5, 3 }, { 5, 6, 3 } };
    int sum[][] = new int[row][col];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum[i][j] = x[i][j] + y[i][j];
      }
    }

    System.out.println("Sum of the two matrices:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }

  }
}
