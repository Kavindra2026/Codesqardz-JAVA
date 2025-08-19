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
    a.name = "Kavindra";
    a.show(a.age);
    a.show(a.name);
  }
}