public class Animals {
  int age;
  String name;

  Animals() {
  }

  void show(int var1) {
    System.out.println(this.name);
  }

  void show(String var1) {
    System.out.println(this.age);
  }

  public static void main(String[] var0) {
    Animals var1 = new Animals();
    var1.age = 20;
    var1.name = "Kavindra Singh";
    var1.show(var1.age);
    var1.show(var1.name);
  }
}