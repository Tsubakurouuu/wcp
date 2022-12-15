public class Main {
  public static void main(String[] args) {
    int isHungry = 0;
    String food = "麻婆豆腐";
    System.out.println("こんにちは");
    if (isHungry == 0) {
    	System.out.println("お腹がいっぱいです");
    } else if (isHungry == 1){
    	System.out.println("はらぺこです");
    	System.out.println(food + "をいただきます");
    	System.out.println("ごちそうさまでした");
    }
  }
}
