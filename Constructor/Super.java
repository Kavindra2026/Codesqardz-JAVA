class Animal {
  String name;

  public Animal() {
    this.name = "Unknown";
    System.out.println("Animal name: " + name);
  }
}

class Dog extends Animal {
  String name;

  public Dog() {
    super();
    this.name = "Dog";
    System.out.println("Dog name: " + name);
  }
}

class Super{
  public static void main(String[] args) {

    Dog d = new Dog();

  }
}
