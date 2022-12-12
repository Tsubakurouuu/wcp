public class confirmation_problem {
    public static void main(String[] args) {
      int i = 5;
      int b = 0;
      int[] a = new int[20];
      while (b < 20) {
        a[b] = (b + 1) * 5;
        b++;
      }

      b = 0;
      String kisuu = "";
      while (b <= 11) {
        if (a[b] % 2 != 0) {
          kisuu = kisuu + a[b] + ",";
        }
        b++;
      }

      String guusuu = "";
      while (b < 20) {
        if (a[b] % 2 == 0) {
          guusuu = guusuu + a[b] + ",";
        }
        b++;
      }
      System.out.println(kisuu.substring(0, kisuu.length() - 1));
      System.out.println(guusuu.substring(0, guusuu.length() - 1));
    }
}