class ParameterizedConstructor {

  int age;
  String name;

  ParameterizedConstructor(String name, int age) {
    this.name = name;
    this.age = age;

  }

  public static void main(String[] args) {
    ParameterizedConstructor s = new ParameterizedConstructor("Kavindra", 20);
    System.out.println("Name: " + s.name + ", Age: " + s.age);
  }
}
