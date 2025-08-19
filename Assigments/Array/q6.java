import java.util.Arrays;
// Done
public class q6 {

  void sort2(int n[][]) {
    for (int i = 0; i < n.length; i++) {
      Arrays.sort(n[i]);
    }
  }

  public static void main(String[] args) {
    int n[][] = { { 12, 2, 3 }, { 36, 32, 5 }, { 38, 12, 55 } };
    q6 s = new q6();
    s.sort2(n);
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n.length; j++) {
        System.out.print(n[i][j] + " ");
      }
      System.out.println();

    }
  }
}
