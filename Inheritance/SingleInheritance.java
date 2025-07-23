class Animal {
  void eat() {
    System.out.println("Animal eats food.");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks.");
  }
}

public class SingleInheritance {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.eat();
    myDog.bark();
  }
}
