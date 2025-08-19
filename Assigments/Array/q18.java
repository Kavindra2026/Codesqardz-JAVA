public class q18 {
  public static void main(String[] args) {
    int triangle[][] = {
        { 1, 2, 8 },
        { 60, 3, 9 },
        { 4, 15, 6 },
    };

    int triangleBMax = triangle[0][0];
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        if (i <= j) {

          if (triangleBMax < triangle[i][j]) {
            triangleBMax = triangle[i][j];
          }
        }
      }
    }

    System.out.println(triangleBMax);
  }
}
