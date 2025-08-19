class Box {
  int width;
  int height;
  int depth;

  public Box() {
    width = height = depth = 0;
  }

  public Box(int w, int h, int d) {
    width = w;
    height = h;
    depth = d;
  }

  void show() {
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
    System.out.println("Depth: " + depth);
  }

  public static void main(String[] args) {
    Box b1 = new Box();
    Box b2 = new Box(10, 30, 50);
    b1.show();
    b2.show();

  }
}