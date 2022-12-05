public class Chapter08 {
    public static void main(String[] args) {
        int number = 1;
        printNum(number);
    }
    
    public static int printNum(int number) {
        if (number < 50) {
            number *= 2;
            System.out.println("Chapter08 = " + number);
            printNum(number);
        }
        return number;
    }
}
