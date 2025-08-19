class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
<<<<<<< HEAD

=======
>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
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
<<<<<<< HEAD
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
=======
        Animal myDog = new Dog(); // Animal reference, Dog object
        Animal myCat = new Cat(); // Animal reference, Cat object

        myDog.makeSound(); // Calls the overridden makeSound() in Dog class - Output: "Woof"
        myCat.makeSound(); // Calls the overridden makeSound() in Cat class - Output: "Meow"

>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
    }
}
