// Converting the model name of the car to lower case

import java.util.Scanner;

public class CarModelToLowerCase {
    	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your favorite car model: ");
		String car = scanner.nextLine();
		
		for (int i = 0; i < car.length(); i++) {
			if ((int)car.charAt(i) < 91 & (int)car.charAt(i) > 64) {
				int alphabet = (int)(car.charAt(i)) + 32;
				System.out.print((char)alphabet);	
			} 
			else {
				System.out.print(car.charAt(i));
			}
		}
	}
}
