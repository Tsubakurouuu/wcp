public class Main {
  	public static void main(String[] args) {
  		double t = calcTriangleArea(10.0, 5.0);
  		double c = calcCircleArea(5.0);
  		System.out.println(t);
  		System.out.println(c);
  	}

  	public static double calcTriangleArea (double bottom, double height) {
  		double TriangleArea = bottom * height / 2;
  		return TriangleArea;
  	}

	public static double calcCircleArea (double radius) {
  		double CircleArea = radius * radius * 3.14;
  		return CircleArea;
  	}
}
