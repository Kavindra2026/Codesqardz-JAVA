public class q2 {
  public static void main(String[] args) {
    int a[] = { 10, 5, 30, 70 };
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
      }
    }
    System.out.println(min);
  }
}
