
public class Main {
	public static void main(String[] args) {
		int n = ClassA.getNumber();
		System.out.println();
	}
}

class ClassA {
	private int number = 0;

	public static int getNumber() {
		return number;
	}
}
