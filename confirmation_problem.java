public class confirmation_problem {
  public static void main(String[] args) {
		int i = 1;
	    while (i < 5) {
	    	System.out.println(i * i);
	        i++;
	    }
	    
	    int[] a = new int[] { 1, 2, 3, 4 };
	    for (i = 0; i < a.length; i++) {
	    	System.out.println(a[i]);
	    }
	    
	    for (int num : a) {
	    	if (num % 2 == 0) {
	    		continue;
	    	}
	    	System.out.println(num);
	    }
	}
}