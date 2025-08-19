import java.util.Date;

class RunnableJob implements Runnable {
  public void run() {
    Thread thread = Thread.currentThread();
    System.out.println("RunnableJob is being run by" + thread.getName() + "at" + new Date());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

public class ThreadJoinExample1 {

  public static void main(String[] args) throws InterruptedException {
    RunnableJob runnableJob = new RunnableJob();
    Thread thread1 = new Thread(runnableJob, "T1");
    Thread thread2 = new Thread(runnableJob, "T2");
    Thread thread3 = new Thread(runnableJob, "T3");
    Thread thread4 = new Thread(runnableJob, "T4");

    thread1.start();
    thread1.join(); // Main thread waits for thread1 to finish
    thread2.start();
    thread2.join();
    thread3.start();
    thread3.join();
    thread4.start();
    thread4.join();

    Thread thread5 = new Thread(runnableJob, "T5");
    Thread thread6 = new Thread(runnableJob, "T6");
    Thread thread7 = new Thread(runnableJob, "T7");
    Thread thread8 = new Thread(runnableJob, "T8");

    thread5.start();
    thread6.start();
    thread7.start();
    thread8.start();
  }
}
