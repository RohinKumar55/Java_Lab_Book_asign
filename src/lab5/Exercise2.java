package lab5;

import java.util.HashMap;

public class Exercise2 {
	
	public long recursiveFibonacci(int n, HashMap<Integer, Long> memo) {
		if (memo.containsKey(n)){
			return memo.get(n);
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		long temp = recursiveFibonacci(n - 1, memo) + recursiveFibonacci(n - 2, memo);
		memo.put(n, temp);
		return temp;
	}
	
	public long nonRecursiveFibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		long a = 1;
		long b = 1;
		long c = 0;
		for (int i=0; i<n - 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2();
		System.out.println(e2.recursiveFibonacci(100, new HashMap<>()));
		System.out.println(e2.nonRecursiveFibonacci(100));
	}

}