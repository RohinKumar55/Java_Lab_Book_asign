package lab7;

import java.util.HashMap;

/*Create a method that accepts a character array and count the 
 * number of times each character is present in the array. 
 * Add how many times each character is present to a 
 * hash map with the character as key and the repetitions count as value
 * */

public class Exercise2 {
	public HashMap<Character, Integer> countCharacter(char[] arr) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char character : arr) {
			if (charCount.containsKey(character)) {
				charCount.put(character, charCount.get(character) + 1);
			}else {
				charCount.put(character, 1);
			}
		}
		return charCount;
	}
	public static void main(String[] args) {
		Exercise2 ex2 = new Exercise2();
		char[] arr = "HelloWorld".toCharArray();
		System.out.println(ex2.countCharacter(arr));
	}
}