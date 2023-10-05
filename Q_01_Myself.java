
//1.	Print your name, hobbies and favorite movie name.
import java.util.Scanner;

public class Q_01_Myself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, hobbies, favMovieName; // initilization of local variables

		System.out.println("Enter your Name: ");
		name = sc.next();

		System.out.println("Enter your favourite movie name: ");
		favMovieName = sc.next();

		System.out.println("Enter your Hobbies : ");
		hobbies = sc.next();

		System.out.println("Your entered data is as below: ");
		System.out.println("Name: " + name);

		System.out.println("favourite movie name: " + favMovieName);
		System.out.println("Hobbies: " + hobbies);

		/*
		 * output 1 : Enter your Name: sunita Enter your favourite movie name: sita
		 * Enter your Hobbies : singing Your entered data is as below: Name: sunita
		 * favourite movie name: sita Hobbies: singing
		 * 
		 * output 2 :
		 * 
		 * Enter your Name: sita Enter your favourite movie name: bahubali Enter your
		 * Hobbies : coding Your entered data is as below: Name: sita favourite movie
		 * name: bahubali Hobbies: coding
		 */

	}

}
