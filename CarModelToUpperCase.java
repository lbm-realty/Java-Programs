// Converting the car model name to Upper case 

import java.util.Scanner;

public class CarModelToUpperCase {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your favorite car model: ");
		String car = scanner.nextLine();
		
		for (int i = 0; i < car.length(); i++) {
			if ((int)car.charAt(i) < 91) {
				System.out.print(car.charAt(i));
			} 
			else {
				int alphabet = (int)(car.charAt(i)) - 32;
				System.out.print((char)alphabet);			
			}
		}
	}
}
