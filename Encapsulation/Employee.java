class Employee {
  private String name;
  private double salary;

  public String getname() {
    return name;

  }

  public double getsalary() {
    return salary;
  }

  public void setname(String name) {
    this.name = name;
  }

  public void setsalary(double salary) {
    this.salary = salary;
  }

  public static void main(String[] args) {
    Employee e = new Employee();
    e.setname("Kavindra");
    e.setsalary(5);
    System.out.println("Employee Name: " + e.getname());
    System.out.println("Employee Salary: " + e.getsalary());
  }
}