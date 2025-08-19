
class q11 {

  public static void main(String[] args) {
    int a[][] = {
        { 4, 5, 9 },
        { 8, 9, 2 }, };

    int b[][] = {
        { 3, 9, 4 },
        { 3, 9, 4 }, };

    int multi[][] = new int[2][3];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        for (int k = 0; k < 2; k++) {
          multi[i][j] += a[i][k] * b[k][j];
        }
      }
      System.out.println();
    }

    System.out.println("Product of matrices:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(multi[i][j] + " ");
      }
      System.out.println();
    }

  }
}