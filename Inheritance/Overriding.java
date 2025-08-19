<<<<<<< HEAD
=======
public class Overriding {
  public static void main(String[] args) {
    display a = new display();
    a.show(20);

  }
}

>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
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
<<<<<<< HEAD

public class Overriding {
  public static void main(String[] args) {
    display a = new display();
    a.show(20);

  }
}
=======
>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
