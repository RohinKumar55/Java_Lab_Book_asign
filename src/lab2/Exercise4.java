package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp1[] = modifyArray(arr);
		System.out.println(Arrays.toString(temp1));
	}

	private static int[] modifyArray(int[] arr) {

		Arrays.sort(arr);
		int temp[] = new int[arr.length];
		int j = 0, check = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != check) {
				temp[j++] = check;
				check = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		return temp;
	}

}