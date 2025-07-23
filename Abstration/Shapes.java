abstract class Shape {
  abstract void draw();
}

class Rectangle extends Shape {
  void draw() {
    System.out.println("drawing rectangle");
  }
}

class Circle extends Shape {
  void draw() {
    System.out.println("drawing circle");
  }
}

public class Shapes {
  public static void main(String args[]) {

    Shape s = new Circle();
    // Shape s = new Rectangle();
    s.draw();
  }
}