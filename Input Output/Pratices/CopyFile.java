import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

  public static void main(String[] args) throws IOException {
    FileInputStream r = new FileInputStream("d:\\f2\\Kavindra.txt");
    FileOutputStream w = new FileOutputStream("d:\\f2\\CopyContent.txt");
    int i;
    while ((i = r.read()) != -1) {
      w.write((char)i);
    }
    System.out.println("Data Copied  SuccessFully... !");

    r.close();
    w.close();

  }

}
