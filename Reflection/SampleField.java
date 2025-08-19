import java.lang.reflect.*;

public class SampleField {
  public static void printField(Object o) {
    Class c = o.getClass();
    Field f[] = c.getFields();
    for (int i = 0; i < f.length; i++) {
      System.out.println(" ");
      Class type = f[i].getType();
      System.out.print(type.getName());
      System.out.print(" " + f[i].getName());
    }
  }

  public static void main(String[] args) {
    Temp c = new Temp();
    printField(c);
  }
}

class Temp {
  public int x;
  public byte b;
  public long l;
  public short b1;
  public double d;
  public char ch;
  float f;
}
