import java.util.*;
import javax.swing.JFrame;

class Task extends TimerTask {
  int count = 1;

  // run is s abclass method that defiene task performed at scheduled time .
  public void run() {
    // if(count ==10)
    // System.exit(0);
    JFrame f = new JFrame();
    f.setSize(400, 400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
    count++;
  }
}

public class TasksScheduling {
  public static void main(String[] args) {
    Timer timer = new Timer();
    int delay = 5000; // delay for 5 seconds
    int period = 2000; // repeat every 1 second
    timer.scheduleAtFixedRate(new Task(), delay, period);

  }
}