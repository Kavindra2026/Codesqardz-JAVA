//   extends interface


interface Gill {
  void add();
}

interface Raj extends Gill {
  void sub();
}

class Ankit implements Raj {
  public void add() {
    int a = 10, b = 20, c;
    c = a + b;
    System.out.println("Addition " + c);
  }

  public void sub() {
    int a = 20, b = 10, c;
    c = a - b;
    System.out.println("Subtraction " + c);
  }
}

class Extend {
  public static void main(String[] args) {
    Raj r = new Ankit();
    r.add();
    r.sub();
  }
}
