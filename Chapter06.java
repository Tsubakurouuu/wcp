public class Chapter06 {
    public static void main(String[] args) {
        int a;
        int c;
        
        a = 5;
        c = ++a;  // a をインクリメントした後に、a が c に代入される
        System.out.println(c);
        // それぞれの値は、a が「6」で c も「6」
        
        a = 5;
        c = a++;  // a を c に代入した後に、a がインクリメントされる
        System.out.println(c);
        // それぞれの値は、a が「6」で c が「5」
        
    }
}