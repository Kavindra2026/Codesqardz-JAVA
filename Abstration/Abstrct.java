abstract class Programing {
  public abstract void Developer();
}

class HTML extends Programing {

  public void Developer() {
    System.out.println("Tim Berners Lee");
  }
}

class Java extends Programing {

  public void Developer() {
    System.out.println("James Gosling");
  }
}

public class Abstrct {
  public static void main(String[] args) {
    HTML h = new HTML();
    Java j = new Java();
    j.Developer();
    h.Developer();
  }
}
