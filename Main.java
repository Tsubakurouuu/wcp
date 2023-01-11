class Animal {
  void x() { System.out.print("Animal "); }
  void y() { x(); }
}
class Cow extends Animal {
  void x() { System.out.print("Cow "); }
  void z() { x(); }
}
public class Main {
  public static void main(String[] args) {
    Cow obj = new Cow();
    obj.y();
    obj.z();
  }
}
