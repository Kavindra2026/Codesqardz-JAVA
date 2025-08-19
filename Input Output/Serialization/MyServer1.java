
import java.io.FileInputStream;
import java.io.ObjectInputStream;

//bees sal baad

public class MyServer1 {
  ObjectInputStream dis;

  public MyServer1() {
    try {
      dis = new ObjectInputStream(new FileInputStream("AppSquadz4.txt"));
      emp z = (emp) dis.readObject();
      emp z1 = (emp) dis.readObject();
      System.out.println("name=" + z.name);
      System.out.println("age= " + z.age);
      System.out.println("a= " + z.a);
      System.out.println("b= " + z.b);
      System.out.println("z= " + z.z);

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    new MyServer1();
  }
}
