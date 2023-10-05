//11 ] Area and perimeter of rectangle – once without using methods and once using static methods for area & perimeter.

public class Q_11_RectangleWithoutMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the dimensions of the rectangle
		double length = 10.0;
		double width = 5.0;

		// Calculate the area and perimeter (perimeter) of the rectangle
		double area = length * width;
		double perimeter = 2 * (length + width);

		// Display the results
		System.out.println("Without Methods - Rectangle with length " + length + " and width " + width + ":");
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}
