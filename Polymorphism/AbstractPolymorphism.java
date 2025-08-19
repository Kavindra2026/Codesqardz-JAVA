abstract class Vehicle {
  abstract void start();
}

class Car extends Vehicle {

  void start() {
    System.out.println("Car is starting with a key");
  }

}

class Bike extends Vehicle {
  void start() {
    System.out.println("Bike is starting wiht a kick");
  }
}

public class AbstractPolymorphism {
  public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle bike = new Bike();
    car.start();
    bike.start();
  }

}
