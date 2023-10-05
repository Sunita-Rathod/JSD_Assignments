//13_A] Initialize 2 variables and find the sum, difference, product, quotient and remainder. 
//Do it without static methods 
public class Q_13_A_MathWithoutStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;

		// Calculate and display the results without static methods
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("Without Static Methods:");
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
		/*
		 * Without Static Methods: Sum: 15 Difference: 5 Product: 50 Quotient: 2
		 * Remainder: 0
		 */
	}
}
