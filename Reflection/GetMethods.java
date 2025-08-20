import java.lang.reflect.Method;

class GetMethods {
  private double div(int numberA, int numberB) {
    return numberA / numberB;
  }
}

class Main {
  public static void main(String[] args) throws Exception {

    GetMethods m1 = new GetMethods();
    Class clazz = m1.getClass();
    Method method = clazz.getDeclaredMethod("div", int.class, int.class);
    method.setAccessible(true);
    System.out.println("Method Name: " + method.getName());
    Double z = (Double) method.invoke(m1, 10, 5);
    System.out.println(z.doubleValue());
  }
}