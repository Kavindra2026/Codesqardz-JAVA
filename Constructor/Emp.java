public class Emp {

  int salary;

  Emp() {
    salary = 1500;
  }

  void show() {
    System.out.println(salary);
  }

  public static void main(String[] args) {
    System.out.println(new Emp().salary);
    new Emp().show();
    System.out.println(new Emp());
  }

}