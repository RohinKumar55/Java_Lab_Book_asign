package lab3;

import java.util.HashMap;

public class Exercise4 {

	public static HashMap<Character, Integer> countCharacter(char[] arr){
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char item : arr) {
			if (charCount.containsKey(item)) {
				charCount.put(item, charCount.get(item)+1);
			}
			else {
				charCount.put(item, 1);
			}
		}
		return charCount;
	}
	
	
	public static void main(String[] args) {
		char[] arr = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
		System.out.println(countCharacter(arr));
	}
}