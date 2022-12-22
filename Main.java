import java.util.ArrayList;
import java.util.*;

public class Main {
  	public static void main(String[] args) {
  		Hero h1 = new Hero("斉藤");
  		Hero h2 = new Hero("鈴木");
  		Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
  		heroes.put(h1, 3);
  		heroes.put(h2, 7);
  		for(Hero h : heroes.keySet()) {
  			int i = heroes.get(h);
  			System.out.println( h.getName() + "が倒した数=" + i);
  		}

  	}
}
