/*10 A] Find area and circumference of a circle, given its radius.  Do this once without using methods
 for area & circumference.
*/
public class Q_10_A_CircleWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the radius of the circle
		double radius = 5.0;

		// Calculate the area and circumference
		double area = Math.PI * radius * radius;
		double circumference = 2 * Math.PI * radius;

		// Display the results
		System.out.println("Without Methods - Circle with radius " + radius + ":");
		System.out.println("Area: " + area);
		System.out.println("Circumference: " + circumference);
		/*
		 * Without Methods - Circle with radius 5.0: Area: 78.53981633974483
		 * Circumference: 31.41592653589793
		 */
	}
}
