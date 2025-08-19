class This {
  double radius;

  This() {
    this(5);
    System.out.println("Default constructor called");
  }

  public This(double r) {
    radius = r;
    System.out.println("Radius: " + radius);
  }

  public static void main(String[] args) {
    This t = new This();
    This t1 = new This(10);

  }

}