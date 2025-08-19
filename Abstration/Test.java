abstract class animal {
  animal() {
    System.out.println("All Animal .....");
  }

  public abstract void sound();
}

class Dog extends animal {
  Dog() {
    super();
  }

  public void sound() {
    System.out.println("Dog is barking");
  }
}

class Lion extends animal {

  Lion() {
    super();
  }

  public void sound() {
    System.out.println("Lion is Roar");
  }
}

class Test {
  public static void main(String[] args) {
    Dog d = new Dog();
    Lion l = new Lion();
    d.sound();
    l.sound();
  }
}