public class CalculateArea {
  private int l;
  private int b;

  public void setArea(int l, int b) {
    this.l = l;
    this.b = b;
  }

  public int getArea() {
    return l * b;
  }

  public static void main(String[] args) {
    CalculateArea a = new CalculateArea();
    a.setArea(5, 10);
    System.out.println("Area: " + a.getArea());
  }
}
