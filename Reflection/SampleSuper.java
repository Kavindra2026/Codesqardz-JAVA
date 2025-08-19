
import java.awt.*;

class SampleSuper {

    public static void printSuperClasses(Object o) {
        Class subClass = o.getClass();
        Class superClass = subClass.getSuperclass();
        while (superClass != null) {
            System.out.println("Super class: " + superClass.getName());
            subClass = superClass;
            superClass = superClass.getSuperclass();
        }
    }

    public static void main(String[] args) {
        Frame f = new Frame("aa");
        printSuperClasses(f);
    }
}
