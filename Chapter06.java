public class Chapter06 {
    public static void main(String[] args) {
        int a = 5;
        boolean c;
        
        c = a < 5;   // c = false
        System.out.println(c);
        c = a <= 5;  // c = true
        System.out.println(c);
        c = a > 4;   // c = true
        System.out.println(c);
        c = a >= 6;  // c = false
        System.out.println(c);
        c = a == 5;  // c = true
        System.out.println(c);
        c = a != 5;  // c = false
        System.out.println(c);

    }
}