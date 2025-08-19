public class q20 {
  public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
      for (char j = 'A'; j <= 'E'; j++) {
        if (i % 2 == 0) {
          System.out.print("*");
        } else {
          System.out.print(j);
        }
      }
      System.out.println();
    }
  }
}
