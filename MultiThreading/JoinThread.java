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
  public Thread2(String s) {
    super();
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
  public Thread3(String s) {
    super();
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

class JoinThread {
  public static void main(String[] args) {
    Thread t1 = new Thread1("Thread1");
    Thread t2 = new Thread2("Thread2");
    Thread t3 = new Thread3("Thread3");
    t1.start();
    t2.start();
    t3.start();
    try {
      t1.join();
      t2.join();
      t3.join();
    } catch (Exception e) {
    }
    for (int i = 1; i <= 2; i++) {
      System.out.println(Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      }
      System.out.println(Thread.currentThread().getName() + "dead");
    }
  }
}