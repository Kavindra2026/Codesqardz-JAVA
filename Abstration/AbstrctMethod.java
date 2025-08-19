abstract class Shape {
  abstract void calculateArea();
  abstract void Circle();
}

class Circle extends Shape {
  void Circle() {
    System.out.println("Drawing a Circle");
  }

  void calculateArea() {
    System.out.println("Calculating area of Circle...");
    double radius = 5;
    double area = Math.PI * radius * radius;
    System.out.println("Area: " + area);
  }
}

public class AbstrctMethod {
  public static void main(String[] args) {
    Shape c = new Circle();
    c.calculateArea();
    c.Circle();
  }
}
