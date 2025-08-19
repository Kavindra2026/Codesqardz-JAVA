import java.io.*;

class MyFileReader {
  public static void main(String[] args) throws IOException {
    FileInputStream fr = new FileInputStream("f2\\lalu.txt");
    int i = 0;
    while ((i = fr.read()) != -1) {
      System.out.print((char) i);
    }
    fr.close();
  }
}