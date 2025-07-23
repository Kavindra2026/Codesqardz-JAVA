public class q26 {
  void dainonal(int a[]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("  ");
      }
      System.out.println(a[i] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = { 12, 35, 1, 10, 34, 10 };
    q26 d = new q26();
    d.dainonal(arr);
  }
}
