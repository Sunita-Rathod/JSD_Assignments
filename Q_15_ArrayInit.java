//15 ]Initialize an int array, char array and a string array with values.

public class Q_15_ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize an int array with values
		int[] intArray = { 1, 2, 3, 4, 5 };

		// Initialize a char array with values
		char[] charArray = { 'A', 'B', 'C', 'D', 'E' };

		// Initialize a String array with values
		String[] stringArray = { "sunita", "sita", "rathod", "riya", "raj" };

		// Print the contents of each array
		System.out.println("Int Array:");
		for (int num : intArray) {
			System.out.print(num + " ");
		}

		System.out.println("\nChar Array:");
		for (char ch : charArray) {
			System.out.print(ch + " ");
		}

		System.out.println("\nString Array:");
		for (String str : stringArray) {
			System.out.print(str + " ");
		}
	}
	/*
	 * Int Array: Int Array: 1 2 3 4 5 Char Array: A B C D E String Array: sunita
	 * sita rathod riya raj
	 */
}
