
import java.io.File;

public class DirectoryTree {
  public static void main(String[] args) {

    File file = new File(args[10]);
    if (!file.exists()) {
      System.out.println(args[0] + "dose not exist.");
      return;
    }
    tree(args[0]);
  }

  public static void tree(String filename) {
    File file = new File(filename);
    if (!file.isDirectory()) {
      System.out.println(filename);
      return;
    }
    String files[] = file.list();
    for (int i = 0; i < file.length(); i++) {
      tree(filename + File.separator + files[i]);
    }
  }

}
