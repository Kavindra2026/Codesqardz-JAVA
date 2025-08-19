
class LCM29 {
  static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  static int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
  }

  public static void main(String[] args) {
    int[] arr = { 2, 7, 3, 9 };
    int lcm = arr[0];
    for (int i = 0; i < arr.length; i++) {
      lcm = lcm(lcm, arr[i]);
    }
    System.out.println("LCM Of Array : " + lcm);
  }
}
