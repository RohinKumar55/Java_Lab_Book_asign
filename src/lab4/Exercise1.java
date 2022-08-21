package lab4;

public class Exercise1 {

	public static int cubeSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += Math.pow((n % 10), 3);
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(cubeSum(1234));
		System.out.println(cubeSum(6588));

	}
}