import java.util.Scanner;

public class DivisibleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}