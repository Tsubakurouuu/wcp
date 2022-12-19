
public class PoisonMatango extends Matango {
	int stock = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (stock > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			System.out.println(dmg + "ポイントのダメージ！");
			this.stock -= 1;
		}


	}

}
