package lab5;

import java.util.Scanner;

class IncorrectEmployeeNameException extends Exception {

	public IncorrectEmployeeNameException(String message) {
		super(message);
	}

}

public class Exercise4 {

	public static void main(String[] args) throws IncorrectEmployeeNameException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		if (firstName.isEmpty() || lastName.isEmpty()) {
			throw new IncorrectEmployeeNameException("Enter Correct First Name and Last Name.");
		}
	}
}