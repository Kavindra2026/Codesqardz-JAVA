class Temp2 {

  int x = getx();

  int getx() {
    System.out.println(x);
    return 10;
  }

  Temp2() {
    x = 0;
    x = getx();
  }

  public static void main(String[] args) {
    Temp2 t = new Temp2();
  }
}