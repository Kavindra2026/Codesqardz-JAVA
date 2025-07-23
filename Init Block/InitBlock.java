public class InitBlock {
  int x;
  {
    this.x = 10;
    System.out.println("Inint Block");
  }

  InitBlock() {
    System.out.println("default");
    System.out.println(x);
  }

  InitBlock(int y) {
    System.out.println(x + y);
  }

  public static void main(String[] args) {
    new InitBlock();
    new InitBlock(10);
  }

}
