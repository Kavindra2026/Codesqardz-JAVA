import java.io.File;

public class FileInfo {
  public static void main(String[] args) {
    File f = new File("d:\\f2\\Kavindra.txt");

    if (f.exists()) {
      System.out.println("File Nmae : " + f.getName());
      // System.out.println("File Path : " + f.getPath());
      System.out.println("File Location : " + f.getAbsolutePath());
      System.out.println("File is Readable : " + f.canRead());
      System.out.println("File is Writable : " + f.canWrite());
      System.out.println("File size : " + f.length() + " bytes");
      System.out.println("File remove : " + f.delete());

    } else {
      System.out.println("File does not exist.");
      System.out.println("Please create the file first.");

    }

  }

}
