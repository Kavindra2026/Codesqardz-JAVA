interface Client {
  void webdesign(); // / public +abstract

  void webdeveloper(); // / public +abstract
}

abstract class RajTech implements Client {

  public void webdesign() {
    System.out.println("Greeb , top menu, three dot button");
  }
}

class RahulTech extends RajTech {

  public void webdeveloper() {

    System.out.println("HTML,  CSS, JAVASCRIPT");
  }

}

public class Developer {

  public static void main(String[] args) {

    RahulTech r = new RahulTech();
    r.webdesign();
    r.webdeveloper();

  }

}
