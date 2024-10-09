// Calculating the total number of characters in the car model entered

import java.util.Scanner;

public record CarModel() {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your favorite car model: ");
		String car = scanner.nextLine();
		
		int i = 0;
		while (i < car.length()) {
			i++;
		}
		System.out.println("The number of characters in the car name is: " + i);
	}

}

