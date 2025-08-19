class Thread1 extends Thread {

  public Thread1(String s) {
    super();
  }

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    System.out.println(getName() + "dead");
  }
}

class Thread2 extends Thread {

  Thread2(String s) {
    super(s);
  }

  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    System.out.println(getName() + "dead");
  }
}

class Thread3 extends Thread {

  Thread3(String s) {
    super(s);
  }

  public void run() {
    for (int i = 1; i <= 15; i++) {
      System.out.println(Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    System.out.println(getName() + "dead");
  }
}

public class SetPriority {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(10);
    System.out.println(Thread.currentThread().getPriority());
    Thread1 t1 = new Thread1("Thread1");
    Thread2 t2 = new Thread2("Thread2");
    Thread3 t3 = new Thread3("Thread3");
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    System.out.println(t3.getPriority());
    t1.setPriority(5);
    t2.setPriority(5);
    t3.setPriority(5);
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    System.out.println(t3.getPriority());
    System.out.println(Thread.currentThread().getPriority());
  }
}
