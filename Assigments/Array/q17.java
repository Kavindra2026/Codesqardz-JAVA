public class q17 {
  public static void main(String[] args) {
    int triangle[][] = {
        { 1, 2, 8 },
        { 6, 3, 7 },
        { 4, 5, 5 },
    };

    int totalSum = 0;
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        if (i <= j) {
          totalSum += triangle[i][j];
        }
      }
    }
    System.out.println("Sum of triangle elements: " + totalSum);

  }
}
