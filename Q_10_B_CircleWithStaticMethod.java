
//10_B ] Find area and circumference of a circle, given its radius. using static methods for area & circumference.

public class Q_10_B_CircleWithStaticMethod {
	final static double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the radius of the circle
		double radius = 5.0;

		// Calculate the area and circumference using static methods
		double area = calculateArea(radius);
		double circumference = calculateCircumference(radius);

		// Display the results
		System.out.println("Using Static Methods - Circle with radius " + radius + ":");
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
	}

	// Static method to calculate the area of a circle
	public static double calculateArea(double radius) {
		return PI * radius * radius;
	}

	// Static method to calculate the circumference of a circle
	public static double calculateCircumference(double radius) {
		return 2 * PI * radius;
		/*
		 * Using Static Methods - Circle with radius 5.0: Area: 78.5 Circumference:
		 * 31.400000000000002
		 */
	}
}