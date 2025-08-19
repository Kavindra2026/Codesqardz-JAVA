public class q4 {

  public static void main(String[] args) {
    int a[][] = { { 50, 40, 10, 20 }, { 80, 85, 60, 70 } };
    int min = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (min > a[i][j]) {
          min = a[i][j];
        }

      }
    }
    System.out.println(min);

  }

}
