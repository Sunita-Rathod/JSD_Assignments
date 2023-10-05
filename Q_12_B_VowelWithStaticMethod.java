/*12_B] Check if the given character is a vowel or consonant by
passing the char to a static method and returning the result.*/

public class Q_12_B_VowelWithStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a'; // Replace with the character you want to check

		// Check if the character is a vowel or consonant using a static method
		boolean isVowel = isVowel(ch);

		// Display the result
		if (isVowel) {
			System.out.println(ch + " is a vowel.");
		} else {
			System.out.println(ch + " is a consonant.");
		}
	}

	// Static method to check if a character is a vowel
	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U');
		/* a is a vowel. */
	}
}
