public class Emp1 {

  static String cname = "TCS";
  String name;
  int salary;

  void get(String s1, int s2) {
    name = s1;
    salary = s2;
  }

  void show() {
    System.out.println(cname);
    System.out.println(name);
    System.out.println(salary);
  }

  static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Emp1 e1 = new Emp1();
    System.out.println(e1.hashCode());
    System.out.println(e1); // printing reference id
    e1.name = "Lalu";
    Emp1 e2 = e1; // copy reference id
    System.out.println(e2);
    e2.name = "bhalu";
    System.out.println(e2.name);     
  }

}
