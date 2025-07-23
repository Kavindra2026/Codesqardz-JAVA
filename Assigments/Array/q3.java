public class q3 {
// Done
  public static void main(String[] args) {
    int a[][] = { { 10, 20, 30 }, { 20, 40, 70 } };
    int max = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {

        if (max < a[i][j]) {
          max = a[i][j];
        }
      }
    }
    System.out.println(max);
  }
}
