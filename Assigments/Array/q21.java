import java.util.Arrays;

public class q21 {
  void frequency(int arr[]) {
    Arrays.sort(arr);
    int fre = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        fre++;
      } else {
        System.out.println(arr[i - 1] + " appears " + fre + " time(s)");
        fre = 1;
      }
    }
    System.out.println(arr[arr.length - 1] + " appears " + fre + " time(s)");
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 3, 2, 7, 6 };
    q21 count = new q21();
    count.frequency(arr);
  }
}
