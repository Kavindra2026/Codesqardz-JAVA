public class q16 {
  // Done
  public static void main(String[] args) {
    int triangle[][] = {
        { 1, 2, 3, 4 },
        { 2, 3, 5, 6 },
        { 4, 5, 6, 6 },
        { 7, 8, 9, 10 }
    };

    int triangleMin = triangle[0][0];
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j <= i; j++) {
        if (triangleMin > triangle[i][j]) {
          triangleMin = triangle[i][j];
        }
      }
    }
    System.out.print("Minimum of triangle : " + triangleMin);
  }
}
