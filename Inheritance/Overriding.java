class show {
  void show(int age) {
    System.out.println(age);
  }
}

class display extends show {
  void display1(int age) {
    System.out.println(age);

  }
}

public class Overriding {
  public static void main(String[] args) {
    display a = new display();
    a.show(20);

  }
}