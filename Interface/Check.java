interface customerKavindra {
  int amount = 5; // Public + Static + Final

  void purchase(); // public + abstract
}

class SellerRaju implements customerKavindra {
  public void purchase() {
    // amount =7 final

<<<<<<< HEAD
    System.out.println("Kavindra needs " + amount + " Kg Rice");
=======
    System.out.println("Kavincdra needs " + amount + " Kg Rice");
>>>>>>> f5ae0f51102ed49bbf37e51ea87a72b6f7fc04c2
  }
}

class Check {
  public static void main(String[] args) {
    customerKavindra c = new SellerRaju();
    c.purchase();
    // System.out.println(customerKavindra.amount); static
  }
}
