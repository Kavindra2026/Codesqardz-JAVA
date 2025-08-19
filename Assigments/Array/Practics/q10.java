public class q10 {
  public static void main(String[] args) {
    int a[][] = {
        { 4, 5, 9 },
        { 8, 9, 2 },
    };

    int b[][] = {
        { 3, 9, 4 },
        { 3, 9, 4 },
    };
    int sum[][] = new int[2][3];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }

  }
}
