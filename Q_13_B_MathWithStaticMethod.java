//13.2] Initialize 2 variables and find the sum, difference, product, quotient and remainder. 
//with static methods.

public class Q_13_B_MathWithStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;

		// Calculate and display the results using static methods
		int sum = add(num1, num2);
		int difference = subtract(num1, num2);
		int product = multiply(num1, num2);
		int quotient = divide(num1, num2);
		int remainder = modulo(num1, num2);

		System.out.println("Using Static Methods:");
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
	}

	// Static method to calculate the sum
	public static int add(int a, int b) {
		return a + b;
	}

	// Static method to calculate the difference
	public static int subtract(int a, int b) {
		return a - b;
	}

	// Static method to calculate the product
	public static int multiply(int a, int b) {
		return a * b;
	}

	// Static method to calculate the quotient
	public static int divide(int a, int b) {
		return a / b;
	}

	// Static method to calculate the remainder
	public static int modulo(int a, int b) {
		return a % b;
	}
	/*
	 * Using Static Methods: Sum: 15 Difference: 5 Product: 50 Quotient: 2
	 * Remainder: 0
	 */
}
