public class q2 {
  // Done
  public static void main(String[] args) {
    int a[] = { 50, 20, 30, 40 };
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
        System.out.println(min);
      }

    }
  }
}
