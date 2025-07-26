public class Person {

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public String setName(String name) {
    this.name = name;
    return name;
  }

  public int getAge() {
    return age;
  }

  public int setAge(int age) {
    this.age = age;
    return age;
  }

  public static void main(String[] args) {
    Person p = new Person();
    p.setName("Kavindra");
    p.setAge(21);
    System.out.println(p.getName());
    System.out.println(p.getAge());
  }
}
