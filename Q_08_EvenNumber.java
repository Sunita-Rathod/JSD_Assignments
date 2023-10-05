//8] Print even numbers from 1 to 10 using for, while, do-while.
public class Q_08_EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using for loop:");
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println("Using while loop:");
		int number = 2;
		while (number <= 10) {
			System.out.println(number);
			number += 2;
		}

		System.out.println("Using do-while loop:");
		int num = 2;
		do {
			System.out.println(num);
			num += 2;
		} while (num <= 10);

		/*
		 * Using for loop: 2 4 6 8 10 Using while loop: 2 4 6 8 10 Using do-while loop:
		 * 2 4 6 8 10
		 */
	}

}
