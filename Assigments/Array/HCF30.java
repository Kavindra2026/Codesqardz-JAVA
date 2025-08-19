public class HCF30 {
  static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  static int Hcf(int[] arr) {
    int result = arr[0];
    for (int i = 1; i < arr.length; i++) {
      result = gcd(result, arr[i]);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 48, 18, 30 };
    int hcf = Hcf(arr);
    System.out.println("HCF of the array is: " + hcf);
  }
}