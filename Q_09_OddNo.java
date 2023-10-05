//9] Print odd numbers from 1 to 10 using for, while, do-while.
public class Q_09_OddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using for loop:");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("Using while loop:");
		int number = 1;
		while (number <= 10) {
			System.out.println(number);
			number += 2;
		}

		System.out.println("Using do-while loop:");
		int num = 1;
		do {
			System.out.println(num);
			num += 2;
		} while (num <= 10);
		/*
		 * output Using for loop: 1 3 5 7 9 Using while loop: 1 3 5 7 9 Using do-while
		 * loop: 1 3 5 7 9
		 */

	}

}
