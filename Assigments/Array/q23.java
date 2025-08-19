public class q23 {
  void binaryToDecimal(int x[]) {
    int decimal = 0;
    for (int i = 0; i < x.length; i++) {
      decimal = decimal * 2 + x[i];
    }
    System.out.println("Decimal value : " + decimal);
  }

  public static void main(String[] args) {
    int[] b = { 1, 0, 1, 1 };
    q23 bd = new q23();
    bd.binaryToDecimal(b);      
  }
}