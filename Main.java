
public class Main {
  	public static void main(String[] args) {
  		Counter c1 = new Counter();
  		Counter c2 = new Counter();
  		c1.pluss();
  		c2.pluss();
  		System.out.println(Counter.getCount());
  	}
}

class Counter {
	static int count = 0;

	public static int getCount() {
		return count;
	}

	public static void pluss() {
		count++;
	}
}
