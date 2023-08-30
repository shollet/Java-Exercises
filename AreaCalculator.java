public class AreaCalculator {

	public static void main(String[] args) {

		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0, 4.0));
		System.out.println(area(-1.0, 4.0));
	}
	
	public static double area(double radius) {
		
		if (radius < 0) {
			return -1;
		}
		
		
		double PI = Math.PI;
		double result = radius * radius * PI;
		return result;
		
	}
	
	public static double area(double x, double y) {
		
		if ((x < 0) || (y < 0)) {
			return -1;
		}
		
		double result = x * y;
		return result;
		
	}

}
