
public class Main {
  	public static void main(String[] args) {
  		Part p1 = new Part();
  		Part p2 = new Part();
  		p1.count = 1;
  		System.out.println(p2.count);
  	}
}

class Part {
	public static int count = 0;
}
