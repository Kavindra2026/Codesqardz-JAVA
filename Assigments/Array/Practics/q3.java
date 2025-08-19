public class q3 {
  public static void main(String[] args) {
    int a[][] = {
        { 10, 100, 30 },
        { 40, 60, 80 }
    };
    int max = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > max) {
          max = a[i][j];
        }
      }
    }
    System.out.println("Maxmum Number In given 2d array" + max);
  }
}
