import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bstream {
  public static void main(String[] args)
      throws Exception {
    // Read one byte at a time and display it
    String srcFile = "f2//Kavindra1.txt";
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));

    byte byteData;
    while ((byteData = (byte) bis.read()) != -1) {
      System.out.print((char) byteData);
    }
  }
}
