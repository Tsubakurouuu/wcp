public class PoisonMatango extends Matango {
  int stock = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (this.stock > 0) {
      System.out.prinln("さらに毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.prinln(dmg + "ポイントのダメージ！");
      stock -= 1;
    }
  }
}