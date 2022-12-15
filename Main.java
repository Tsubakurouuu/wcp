public class Main {
  	public static void main(String[] args) {
      	double triangle = calcTriangleArea(5.0,10.0);
      	double circle = calcCircleArea(5.0);
      	System.out.println(triangle);
      	System.out.println(circle);
  	}

  	public static double calcTriangleArea(double bottom, double height) {
  		double triangle = bottom * height / 2;
  		return triangle;
  	}

  	public static double calcCircleArea(double radius) {
	  	double circle = radius * radius * 3.14;
	  	return circle;
  	}
}
