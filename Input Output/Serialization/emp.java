
import java.io.Serializable;

public class emp extends Base implements Serializable {
  private static final long SerialVersionUID = 1l;
  transient int a;
  static int b;
  String name;
  int age;
  int salary;

  public emp(String name, int age, int a, int b, int z) {

    this.name = name;
    this.age = age;
    this.a = a;
    this.b = b;
    this.z = z;
  }

}
