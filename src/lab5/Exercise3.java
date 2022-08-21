package lab5;

public class Exercise3 {

	public boolean isPrime(int n) {
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public void primeInteger(int n) {
		for (int i=1; i < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Exercise3 e3 = new Exercise3();
		e3.primeInteger(100);
	}

}