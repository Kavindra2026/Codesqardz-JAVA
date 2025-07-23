class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal {

    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Animal myDog = new Dog(); // Animal reference, Dog object
        Animal myCat = new Cat(); // Animal reference, Cat object

        myDog.makeSound(); // Calls the overridden makeSound() in Dog class - Output: "Woof"
        myCat.makeSound(); // Calls the overridden makeSound() in Cat class - Output: "Meow"

    }
}
