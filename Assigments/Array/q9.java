public class q9 {
  // Done
  void interSection(int a[], int b[]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {

        if (a[i] == b[j]) {
          System.out.print(a[i] + " ");
        }
      }
    }
  }

  public static void main(String[] args) {
    int a[] = { 8, 5, 60 };
    int b[] = { 8, 5, 9 };
    q9 i = new q9();
    i.interSection(a, b);
  }
}