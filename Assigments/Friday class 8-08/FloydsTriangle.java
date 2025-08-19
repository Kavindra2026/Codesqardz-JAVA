
import java.util.Scanner;

public class FloydsTriangle {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.err.print("Enter the number of  row : ");
    int row = sc.nextInt();
    System.err.println("Floyds Triangle Generates\n");
    int count = 1;
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count++;

      }
      System.out.println();
    }

  }

}
