public class SumOf10Number {
  void Sum() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {

      // sum = sum + i;
      sum += i;

    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    SumOf10Number s = new SumOf10Number();
    s.Sum();
  }

}
