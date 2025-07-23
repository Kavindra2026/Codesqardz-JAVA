public class q4 {
  public static void main(String[] args) {
    for (int i = 0; i < 7; i++) {
      if (i % 2 != 0) {
        for (int j = i; j < 7; j++) {
          System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
          System.out.print(i);
        }
        System.out.println();
      }

    }
  }
}
