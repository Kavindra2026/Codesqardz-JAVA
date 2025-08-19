public class q3 {

  public static void main(String[] args) {

    for (int i = 0; i < 7; i++) {
      for (int j = i; j < 7; j++) {

        System.out.print(" ");
      }

      for (int k = 0; k < i; k++) {

        System.out.print("*");

      }

      System.out.println();
    }
  }
}
