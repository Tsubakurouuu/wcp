public class confirmation_problem {
    public static void main(String[] args) {
      int i = 1;
      int c = 0;
      int s = 0;
      while (i <= 10) {
        if (i % 2 == 0) {
          c ++;
          s += i;
        }
        i++;
      }
      System.out.println("偶数は" + c +"個");
      System.out.println("偶数の合計は" + s );
    }
}