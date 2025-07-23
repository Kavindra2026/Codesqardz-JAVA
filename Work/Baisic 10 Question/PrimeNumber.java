
class PrimeNumber{
    public static void main(String[] args) {
        int n = 8;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n + " Not prime number");

        } else {
            System.out.println(n + " is prime number");
        }
    }
}
