public class Anonymous {
  int salary;

  public Anonymous() {
    salary = 1500;
  }

  void show() {
    System.out.println(salary);
  }

  public static void main(String[] args) {
    System.out.println(new Anonymous().salary);
    new Anonymous().show();
    System.out.println(new Anonymous());
  }
}
