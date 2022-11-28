public class Chapter08 {
  public static void main(String[] args) {
    // 1.「while」文
    int number = 1;
    int multiplier;
    while (number < 5) {
      multiplier = number * number;
      number++;
      System.out.println(multiplier);
    }
    
    // 2. 通常「for」文
    int array[] = { 1, 2, 3, 4 };
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    
    // 3. 拡張「for」文
    for (int val : array) {
      if (val % 2 == 0) {
        continue;
      }
      System.out.println(val);
    }
  }
}