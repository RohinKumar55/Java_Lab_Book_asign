package lab5;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'red', 'yellow' or 'green'.");
		String in = sc.nextLine();
		if (in.equals("red")) {
			System.out.println("Stop");
		}else if (in.equals("yellow")) {
			System.out.println("Ready");
		}else if (in.equals("green")) {
			System.out.println("Go");
		}else {
			System.out.println("Incorrect Input.");
		}
		sc.close();
	}
}