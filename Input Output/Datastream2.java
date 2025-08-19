import java.io.*;

public class Datastream2 {

  public static void main(String[] args) throws IOException {
    DataInputStream din = new DataInputStream(System.in);
    FileOutputStream fout = new FileOutputStream("f2//AppSquadz.txt");
    PrintStream dout = new PrintStream(fout);
    String s = " ";
    while (!s.equals("Stop")) {
      s = din.readLine();
      dout.println(s);
    }
    din.close();
    dout.close();

  }

}
