import java.io.File;

class AllDriveSpace {
  public static void main(String[] args) {
    File[] roots = File.listRoots();
    long gb = 1024 * 1024 * 1024;
    for (int i = 0; i < roots.length; i++) {
      System.out.println(roots[i]);
      System.out.println("Free space = " + roots[i].getFreeSpace() / gb + " GB");
      System.out.println("Usable space = " + roots[i].getUsableSpace() / gb + " GB");
      System.out.println("Total space = " + roots[i].getTotalSpace() / gb + " GB");
      System.out.println();
    }
  }
}