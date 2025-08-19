public class Assingnment5 {
  public static void main(String[] args) {
    int rows = 7; // number of rows

    for (int i = 1; i <= rows; i++) {

      // Print spaces for centering
      for (int s = rows; s > i; s--) {
        System.out.print("    "); // 4 spaces for alignment
      }

      // Print first half numbers
      int num = 1;
      for (int j = 1; j <= i; j++) {
        System.out.printf("%-4d", num);
        num *= 2; // multiply by 2 for next number
      }

      // Print second half numbers (mirror, divide by 2 each time)
      num /= 2;
      for (int j = i - 1; j >= 1; j--) {
        num /= 2;
        System.out.printf("%-4d", num);
      }

      System.out.println();
    }
  }
}
