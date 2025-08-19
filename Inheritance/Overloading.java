class Overloading {

  int age;
  String name;

  void show(int age) {
    System.out.println(name);
  }

  void show(String name) {
    System.out.println(age);

  }

  public static void main(String[] args) {
    Overloading a = new Overloading();
    a.age = 20;
<<<<<<< HEAD
    a.name = "Kavindra";
=======
    a.name = "harsh";
>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
    a.show(a.age);
    a.show(a.name);
  }
}