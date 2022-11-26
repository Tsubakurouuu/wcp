public class Chapter06 {
    public static void main(String[] args) {
        String a = "applePie";
        String b = "applePie";
        boolean c;
        c = a == b;  // c = true
        System.out.println(c);

        String d = "apple";
        String e = d + "Pie";
        c = a == e;  // c = false
        System.out.println(c);

        String f = new String("applePie");
        c = a == f;  // c = false
        System.out.println(c);

        // 変数の中身はすぐ上の例と同じ
        c = a.equals(b);  // c = true
        System.out.println(c);
        c = a.equals(e);  // c = true
        System.out.println(c);
        c = a.equals(f);  // c = true
        System.out.println(c);
    }
}