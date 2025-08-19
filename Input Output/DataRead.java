import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataRead {
  public static void main(String[] args)
      throws IOException {
    DataInputStream din = new DataInputStream(new FileInputStream("f2//AppSquadz4.txt"));
    String s = " ";
    while (s != null) {
      s = din.readLine();
      if (s != null)
        System.out.println(s);
    }
    din.close();
  }
}
