
import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilterEX {
  public static void main(String[] args) {
    String dirname = "Fileclass";
    File f1 = new File(dirname);
    FilenameFilter only = new ExtensionFilter("java");
    String s[] = f1.list(only);// (FilenameFilter f)
    for (int i = 0; i < s.length; i++) {
      System.out.println(s[i]);
    }
  }
}

class ExtensionFilter implements FilenameFilter {
  String ext;
  int i = 1;

  public ExtensionFilter(String ext) {
    this.ext = "." + ext;
  }

  public boolean accept(File dir, String name) {
    System.out.println("accept");
    return name.endsWith(ext);
  }
}