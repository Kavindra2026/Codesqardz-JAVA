public class q16 {
  public static void main(String[] args) {
    char x='E';
    for (char i ='A'; i <='E'; i++) {
      for (char j = x; j >=i; j--) {
        System.out.print(j);
      }
      System.out.println();
      x++;
    }
  }
}
