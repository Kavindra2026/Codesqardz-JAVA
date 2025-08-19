public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500:");
        for (int num = 1; num <= 500; num++) {
            int sum = 0;
            int temp = num;

            for (; temp > 0; temp = temp / 10) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
