
import java.io.*;

public class RenameFile {
  public static void main(String[] args) {

    File f = new File("D:\\f2\\Kavindra.txt");
    File r = new File("D:\\f2\\Kavindra Singh.txt");

    if (f.exists()) {
      System.out.println(f.renameTo(r));
    } else {
      System.out.println("File doesn't exist");
    }
  }

}
