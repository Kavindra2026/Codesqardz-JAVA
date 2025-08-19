public class q15 {

  // Done
  public static void main(String[] args) {
    int[][] triangle = {
        { 1, 2, 3, 50 },
        { 2, 3, 5, 6 },
        { 4, 5, 6, 6 },
        { 7, 8, 9, 10 }
    };
    int triangleMax = triangle[0][0];
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < i; j++) {
        if (triangleMax < triangle[i][j]) {
          triangleMax = triangle[i][j];
        }
      }
    }
    System.out.println("Maximum Element of triangle: " + triangleMax);
  }
}
