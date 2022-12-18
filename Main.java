public class Main {
  	public static void main(String[] args) {
  		int[] numbers = {3, 4, 9};
  		System.out.println("１桁の文字を入力してください");
  		int input = new java.util.Scanner(System.in).nextInt();
  		for (int n : numbers) {
  			if (input == n) {
  				System.out.println("アタリ！");
  				break;
  			}
  		}

  	}
}
