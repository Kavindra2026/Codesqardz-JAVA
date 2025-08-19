public class ThreadJoinExample {
  public static void main(String[] args) {

    Thread t1 = new Thread(new MyRunnable(), "t1");
    Thread t2 = new Thread(new MyRunnable(), "t2");
    Thread t3 = new Thread(new MyRunnable(), "t3");

    t1.start();
    // start second thread after waithing for 2 seconds or if it's dead
    try {
      t1.join(2000); // waithing gor t1 to finish or timeout after 2 secondd;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    t2.start();
    // start third thread after waithing for 2 seconds or if it's dead
    try {
      t2.join(2000); // waithing for t2 to finish or timeout after 2 seconds;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    t3.start();
    // wait for third thread to finish
    System.out.println(t1.isAlive());
    try {
      t1.join(); // waithing for t3 to finish;
      t2.join(); // waithing for t3 to finish;
      t3.join(); // waithing for t3 to finish;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("All threads are dead, exiting main thread");
  }
}

class MyRunnable implements Runnable {

  public void run() {
    System.out.println("Thread started:::" + Thread.currentThread().getName());
    try {
      Thread.sleep(4000);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Thread ending:::" + Thread.currentThread().getName());

  }
}