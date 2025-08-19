public class q22 {
  void repeat(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count == 1) {
        System.out.print(arr[i] + "  ");
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 3, 3, 7, 8, 4 };
    q22 r = new q22();
    r.repeat(arr);
  }
}
