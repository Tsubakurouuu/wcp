
public class Main {
  	public static void main(String[] args) {
  		int[] a = new int[20];
  		for (int i = 0; i < a.length; i++) {
  			a[i] = (i + 1) * 5;
  		}

  		String kisuu = "";
  		for (int i = 0; i <= 10; i++) {
  			if (a[i] % 2 != 0) {
  				kisuu = kisuu + a[i] + ",";
  			}
  		}
  		System.out.println("奇数：" + kisuu.substring(0, kisuu.length() -1));

  		String guusuu = "";
  		for (int i = 11; i <= 19; i++) {
  			if (a[i] % 2 == 0) {
  				guusuu = guusuu + a[i] + ",";
  			}
  		}
  		System.out.println("奇数：" + guusuu.substring(0, guusuu.length() -1));
  	}
}
