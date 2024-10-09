import java.util.Scanner;

public class DecimalToRoman {
    public static void main(String[] args) {
		// Initializing decimal numbers array		
		int[] decimalNumbers = {50, 10, 9, 5, 4, 1};
		
		// Initializing roman numerals array 
		String[] romanNumerals = {"L", "X", "IX", "V", "IV", "I"};
		
		// Initialized the scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		// Initialized the variable that will store user input
		int number;
		
		// Keep asking for a number until a number between 1 and 90 is entered
		do {
			System.out.print("Enter a number between 1 and 90: ");
			number = scanner.nextInt();
		} while (1 > number || number > 90);
		
		
		for (int i = 0; i < decimalNumbers.length; i++) {
			while (number >= decimalNumbers[i]) {
				System.out.print(romanNumerals[i]);
				number -= decimalNumbers[i];
			}
		}
		
	}
}
