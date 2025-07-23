public class q14 {
    // Done

    public static void main(String[] args) {
        int triangle[][] = {
                { 1, 2, 3, 4 },
                { 2, 3, 5, 6 },
                { 4, 5, 6, 6 },
                { 7, 8, 9, 10 }
        };

        int totalSum = 0;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i >= j) {
                    totalSum += triangle[i][j];
                }
            }
        }
        System.out.println("Sum of triangle elements: " + totalSum);
    }
}
