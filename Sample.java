
public class Sample {
	String name;
	public void print() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		s1.name = "A";
		s2.name = "B";
		s1.print();
		s2.print();
	}

}
