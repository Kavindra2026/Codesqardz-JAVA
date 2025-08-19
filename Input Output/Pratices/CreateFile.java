import java.io.*;

class CreateFile {
  public static void main(String[] args) throws IOException {
    File f = new File("d:\\f2\\Kavindra.txt");
    if (f.createNewFile()) {
      System.out.println("File created successfully: " + f.getName());
    } else {
      System.out.println("File already exists! " + f.getName());
    }
  }
}