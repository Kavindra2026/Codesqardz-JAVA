
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyServer {
  ObjectInputStream dis;

  public MyServer() {
    try {
      dis = new ObjectInputStream(new FileInputStream("appSquadz3"));

      emp z = (emp) dis.readObject();
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
    {
      new MyServer();
    }
  }

}
