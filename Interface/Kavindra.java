import java.util.Scanner;

interface Client {
  void input();

  void output();
}

class Kavindra implements Client {
  String name;
  double salary;

  public void input() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Username");
    name = sc.nextLine();
    System.out.println("Enter Salary");
    salary = sc.nextDouble();
  }

  public void output() {
    System.out.println(name + " : " + salary);
  }

  public static void main(String[] args) {
    Client c = new Kavindra();
    c.input();
    c.output();
  }

}