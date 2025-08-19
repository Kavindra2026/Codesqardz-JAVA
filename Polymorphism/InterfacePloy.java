interface Flyable{
  void fly();
}
class Bird implements Flyable {
  public void fly() {
    System.out.println("Bird is flying");
  }
}
class Airplane implements Flyable {
  public void fly() {
    System.out.println("Airplane is flying");
  }
}


public class InterfacePloy {
  public static void main(String[] args) {
    Flyable b=new Bird();
    Flyable a=new Airplane();
    b.fly();
    a.fly();
  }

}
