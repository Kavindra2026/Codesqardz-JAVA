public class RemoveAllTrim {
  public static void main(String[] args) {
    String input = "   Hello Java  ";
    String noSpaces = "";
    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) != ' ') {
        noSpaces += input.charAt(i);
      }
    }
    System.out.println("Without Any Spaces: '" + noSpaces + "'");
  }
}
