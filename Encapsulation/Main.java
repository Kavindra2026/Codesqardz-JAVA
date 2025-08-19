class Programmer {
  private String name;

  public String getName() {
    return name;
  }

  public String setname(String name) {
    this.name = name;
    return name;
  }
}

public class Main {
  public static void main(String[] args) {
    Programmer p = new Programmer();
    p.setname("Kavindra Singh");
    System.out.println(p.getName());
  }
}