
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ps1 {

  public static void main(String[] args) throws IOException {
    FileOutputStream fout = new FileOutputStream("f2//pss.txt");
    PrintStream ps = new PrintStream(fout);
    ps.println("Hello");
    ps.println("hay");
    System.out.println("file created");
  }
}
