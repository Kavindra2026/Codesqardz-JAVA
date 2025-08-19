public class q19 {
  public static void main(String[] args) {
    char x = 'A';
    for (int i = 0; i < 10; i++) {
      for (char j = 'A'; j <= 'E'; j++) {
        System.out.print(x++);
      }
      System.out.println();
    }
  }

}
