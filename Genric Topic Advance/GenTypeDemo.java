class GenStr<T extends String> {
  T str; // here, T will be replaced by String

  GenStr(T o) {
    str = o;
  }

  T getstr() {
    return str;
  }
}

public class GenTypeDemo {
  public static void main(String args[]) {
    GenStr<String> fOb = new GenStr<String>("aaa");
    System.out.println(fOb.getstr());
  }

}