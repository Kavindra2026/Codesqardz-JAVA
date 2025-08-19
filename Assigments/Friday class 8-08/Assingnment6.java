public class Assingnment6 {
  public static void main(String[] args) {
    int rows = 7;
    for (int i = 0; i < rows; i++) {
      int num = 1;

      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");

        if (num < 10) {
          System.out.print(" ");
        }

        num = num * (i - j) / (j + 1);
      }

      System.out.println();
    }
  }
}
