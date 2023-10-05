
//3.Add five integers (using variables) and display their sum.
import java.util.Scanner;

public class Q_03_AddFiveIntVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//take 5 int values from user
		System.out.println("Enter five integers, pressing Enter after each:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		// Calculate the sum
		int sum = num1 + num2 + num3 + num4 + num5;

		// Display the sum
		System.out.println("The sum of five integers is: " + sum);

	}
}
