public class q24 {
  void maxRow(int a[][]) {
    for (int i = 0; i < a.length; i++) {
      int max = a[i][0];
      for (int j = 1; j < a[i].length; j++) {
        if (a[i][j] > max) {
          max = a[i][j];
        }
      }
      System.out.println("Maximum of row " + i + ": " + max);
    }
  }

  public static void main(String[] args) {
    int a[][] = {
        { 10, 20, 30 },
        { 350, 50, 80 },
        { 80, 1400, 120 }
    };
    q24 m = new q24();
    m.maxRow(a);
  }
}
