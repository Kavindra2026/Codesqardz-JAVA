class printer {
  void display(int a) {
    System.out.println("Number: " + a);
  }

  void display(String b) {
    System.out.println("String: " + b);
  }

}

class Overloading {

  public static void main(String[] args) {
    printer p = new printer();
    p.display(5);
    p.display("Kavindra");
  }
}
