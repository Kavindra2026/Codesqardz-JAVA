class q12 {
  public static void main(String[] args) {
    int a[][] = {
        { 14, 58, 36 },
        { 14, 25, 36 },
        { 10, 15, 30 }
    };
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(a[j][i] + " ");
      }
      System.out.println();
    }
  }
}