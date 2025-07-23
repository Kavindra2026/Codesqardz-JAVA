public class q4 {
  //Done
  void min(int a[][]) {
    int min = a[0][0];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (min > a[i][j]) {
          min = a[i][j];
        }
      }
    }
    System.out.println("Minimum value is: " + min);
  }

  public static void main(String[] args) {
    int a[][] = { { 20, 40, 10 }, { 50, 80, 5 } };
    q4 m = new q4();
    m.min(a);

  }
}
