interface customerKavindra {
  int amount = 5; // Public + Static + Final

  void purchase(); // public + abstract
}

class SellerRaju implements customerKavindra {
  public void purchase() {
    // amount =7 final

    System.out.println("Kavindra needs " + amount + " Kg Rice");
  }
}

class Check {
  public static void main(String[] args) {
    customerKavindra c = new SellerRaju();
    c.purchase();
    // System.out.println(customerKavindra.amount); static
  }
}
