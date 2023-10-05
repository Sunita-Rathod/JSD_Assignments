/*7 .Initialize 2 numbers and initialize 1 char variable for mathematical operator.
Find the sum, difference, product and quotient and remainder depending on the mathematical operator value. 
(Use switch statement).*/

public class Q_07_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 2;
		double num2 = 4;
		char c = '*';
		// Change this to +, -, *, /, or % for different operations

		// Perform the operation based on the operator value using a switch statement
		switch (c) {

		case '+':
			System.out.println("Sum is : " + (num1 + num2));
			break;

		case '*':
			System.out.println("Product is : " + (num1 * num2));
			break;

		case '-':
			System.out.println("Subtraction  is : " + (num1 - num2));
			break;

		case '/':
			if (num2 != 0)
				System.out.println("Division  is : " + (num1 / num2));
			else
				System.out.println("Not divisible by 0 and it is invalid!");
			break;

		case '%':
			if (num2 != 0)
				System.out.println("Remender  is : " + (num1 % num2));
			else
				System.out.println("Not divisible by 0 and it is invalid!");
			break;

		}

	}

}
