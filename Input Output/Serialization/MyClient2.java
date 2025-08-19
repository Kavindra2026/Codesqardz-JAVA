
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MyClient2 {
  ObjectOutputStream dout;
  public  MyClient2(){
    try {


      emp e1=new emp("appSquadz noida",10, 5, 20,100);
      emp e2=new emp("lalu", 13, 5, 20, 100);
      dout =new ObjectOutputStream(new FileOutputStream("../f2//AppSquadz4.txt"));
      dout.writeObject(e1);
      dout.writeObject(e2);
      dout.flush();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  public static void main(String[] args) {
    new MyClient2();
  }

}
