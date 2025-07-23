public class q19 {

  public static void main(String[] args) {
    int triangle[][] = {
        { 42, 2, 8 },
        { 60, 3, 9 },
        { 1, 15, 6 },
    };

    int triangleBMin = triangle[0][0];
    for (int i = 0; i < triangle.length; i++) {
      for (int j = 0; j < triangle[i].length; j++) {
        if (i <= j) {

          if (triangleBMin > triangle[i][j]){
            triangleBMin = triangle[i][j];
          }
        }
      }
    }

    System.out.println(triangleBMin);
  }
}
