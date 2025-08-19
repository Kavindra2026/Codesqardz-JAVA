
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ps {
  public static void main(String[] args) throws IOException {
    FileOutputStream fout = new FileOutputStream("f2//chachi.txt");

    PrintStream ps = new PrintStream(fout);
    FileOutputStream fout1 = new FileOutputStream("f2//chacha.txt");
    PrintStream ps1 = new PrintStream(fout1);
    System.out.println("Before");
    PrintStream ps4 = System.out;

    System.setOut(ps);
    System.setErr(ps1);
    System.out.println("Chachi  420");
    System.out.println("Chachi 840");
    System.out.println("Chacha 420");
    System.out.println("Chacha 840");

    // System.out=ps4;
    System.setOut(ps1);
    System.out.println("Chacha 240");
    System.setOut(ps4);
    ps4.println("after");
    System.out.println("Via actule out");
  }
}
