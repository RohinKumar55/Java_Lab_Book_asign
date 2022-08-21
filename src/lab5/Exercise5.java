package lab5;

import java.util.Scanner;

class IncorrectAgeException extends Exception {

	public IncorrectAgeException(String message) {
		super(message);
	}
	
}
public class Exercise5 {

	public static void main(String[] args) throws IncorrectAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		if (age < 15) {
			throw new IncorrectAgeException("Age of person should be above 15.");
		}
	}
}