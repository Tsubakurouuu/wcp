public class Chapter06 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;
        
        c = a && true;   // c = true
        System.out.println(c);
        c = a && false;  // c = false
        System.out.println(c);
        c = b || true;   // c = true
        System.out.println(c);
        c = b || false;  // c = false
        System.out.println(c);
        c = !a;          // c = false
        System.out.println(c);
        c = !b;          // c = true
        System.out.println(c);

    }
}