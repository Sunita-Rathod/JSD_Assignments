
//14] Store 5 integers in an array and print in reverse order.

public class Q_14_ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of 5 integers
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };

		// Print the array in reverse order
		System.out.println("Array in reverse order:");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}
	/*
	 * Array in reverse order: 70 60 50 40 30 20 10
	 */
}
