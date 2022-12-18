
public class Main {
  public static void main(String[] args) {
	int c = 0;
	int s = 0;
    for (int i = 1; i <= 10; i++) {
    	if (i % 2 == 0) {
    		c += 1;
    		s += i;
    	}
    }
    System.out.println("偶数の数は" + c);
    System.out.println("偶数の合計は" + s);
  }
}
