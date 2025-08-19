abstract class Programing {
  public abstract void Developer();
}

class HTML extends Programing {
  @Override
  public void Developer() {
    System.out.println("Tim Berners Lee");
  }
}

class Java extends Programing {

  @Override
  public void Developer() {
    System.out.println("James Gosling");
  }
}

public class Main {
  public static void main(String[] args) {
    HTML h = new HTML();
    Java j = new Java();
    j.Developer();
    h.Developer();
  }
}
