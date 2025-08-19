import java.io.*;
public class FileWrite {
  public static void main(String[] args) throws IOException {
    FileWriter w = new FileWriter("d:\\f2\\Kavindra.txt");
    w.write("Hello, this is a test write operation.");
    w.close();
    System.out.println("Data Written Successfully!");
  }
}
