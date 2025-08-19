import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;

public class SInput {
  public static void main(String[] args) throws IOException {
    // FileInputStream("chacha.txt");
    SequenceInputStream sin = new SequenceInputStream(new MyEnum());
    DataInputStream din = new DataInputStream(sin);
    String s = " ";
    while (s != null) {
      s = din.readLine();
      if (s != null)
        System.out.println(s);
    }
    din.close();
  }
}

class MyEnum implements Enumeration {
  InputStream in[];
  int i = -1;

  MyEnum() {

    try {
      in = new InputStream[] { new FileInputStream("f2//chahci.txt"), new FileInputStream("f2//chcha.txt"),
          new FileInputStream("f2//pass.txt") };
    } catch (Exception e) {
    }
  }

  public boolean hasMoreElements() {
    System.out.println("hasMoreElements");
    if (++i < in.length)
      return true;

    else
      return false;
  }

  public Object nextElement() {
    System.out.println("nextElement" + i);
    return in[i];
  }

}
