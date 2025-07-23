public class RightTrim {
  public static void main(String[] args) {
    String input = "   Hello World     ";
    int index = input.length() - 1;

    // Move left while the character is a space
    while (index >= 0 && input.charAt(index) == ' ') {
      index--;
    }

    // Trim from 0 to index + 1
    String result = input.substring(0, index + 1);
    System.out.println("After Right Trim: '" + result + "'");
  }
}
