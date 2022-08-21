package lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Create a method which accepts a hash map and 
// return the values of the map in sorted order as a List.

public class Exercise1 {
	public List getValues(HashMap map) {
		List temp = new ArrayList<>(map.values());
		Collections.sort(temp);
		return temp;
	}
	public static void main(String[] args) {
		Exercise1 ex1 = new Exercise1();
		HashMap hm1 = new HashMap();
		hm1.put("H", 1);
		hm1.put("e", 5);
		hm1.put("l", 2);
		hm1.put("o", 8);
		hm1.put("w", 1);
		hm1.put("r", 9);
		hm1.put("d", 5);
		System.out.println(ex1.getValues(hm1));
	}
}