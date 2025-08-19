public class q21 {
  public static void main(String[] args) {
    char i, j, k;
    for (i = 'A'; i <= 'E'; i++) {
      for (j = 'A'; j <= 'E'; j++) {
        if (i % 2 == 0) {
          System.out.print(j);
        } else {
          for (k = 'a'; k <= 'e'; k++) {
            System.out.print(k);
          }
        }
      }
      System.out.println();
    }
  }

}
