public class confirmation_problem {
    public static void main(String[] args) {
      int i = 1;
      String str = "";
      while (i <= 10) {
        if (i == 10) {
          str = str + i;
        } else {
          str = str + i + ",";
        }
        i++;
      }
      System.out.println(str);
    }
}