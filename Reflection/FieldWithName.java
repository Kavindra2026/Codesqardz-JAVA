import java.lang.reflect.Field;

public class FieldWithName {
  public static void main(String[] args) throws Exception {

    Temp t = new Temp();
    Class cls = t.getClass();
    t.show();

    Field field = cls.getDeclaredField("x");
    field.setAccessible(true);
    System.out.println(field);
    System.out.println(field.get(t));
    field.set(t, 40);

    System.out.println(field.get(t));
    t.show();
  }
}

class Temp {
  private final int x = 1000;

  void show() {
    System.out.println(x);
  }
}
