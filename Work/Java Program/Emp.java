public class Emp {
  static String cname = "TCS";
  String name;
  int Salary;

  void get(String s1, int s2) {
    name = s1;
    Salary = s2;
  }

  void show() {
    System.out.println("Company Name: " + cname);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + Salary);
  }

  public static void main(String[] args) {
    Emp e1 = new Emp();
    e1.get("Lalu", 101);
    e1.show();
  }
}