public class Chapter07 {
    public static void main(String[] args) {
        int d = 11;
        if (d <= 5) {
            System.out.println("とても近いです");
        } else if (d <= 10) {
            System.out.println("近いです");
        } else if (d <= 15) {
            System.out.println("遠いです");
        } else {
            System.out.println("とても遠いです");
        }
    }
}
