public class IsInterface {
  public static void main(String[] args) throws Exception {

    Class clazz = int.class;
    Class ar = int[].class;
    Class c = java.io.Serializable.class;
    boolean IsInterface = clazz.isPrimitive();
    boolean IsInterface1 = c.isInterface();
    boolean IsInterface2 = c.isArray();
    System.out.println(ar.getName());
    Class inter[] = ar.getInterfaces();
    for (int i = 0; i < inter.length; i++) {

      System.out.println(inter[i].getName());
    }
    System.out.println("Is primitive = " + IsInterface);
    System.out.println("Is Interfface = " + IsInterface1);
    System.out.println("Is Array = " + IsInterface2);
  }

}
