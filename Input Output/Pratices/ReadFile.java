import java.io.FileReader;
import java.io.IOException;

class ReadFile {
  public static void main(String[] args) throws IOException {
    FileReader f = new FileReader("d:\\f2\\Kavindra.txt");
    int i;
    while ((i = f.read()) != -1) {
      System.out.print((char) i);
    }
    f.close();

  }
}