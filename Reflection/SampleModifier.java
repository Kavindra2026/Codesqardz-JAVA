import java.lang.reflect.*;

public class SampleModifier {
  public static void printModifier(Object o) throws Exception {
    Class c = Class.forName("java.awt.Graphics");
    int m = c.getModifiers();
    if (Modifier.isPublic(m)) {
      System.out.println("Public");
    }
    if (Modifier.isFinal(m)) {
      System.out.println("Final");
    }
    if (Modifier.isAbstract(m)) {
      System.out.println("Abstract");
    }
  }

  public static void main(String args[]) throws Exception {
    String a = new String("aaa");
    printModifier(a);
  }

}
