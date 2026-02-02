package Arrays;

public class CountPrimeInArray {
	public static void main(String[] args) {
		int arr[] = { 21, 15, 42, 62, 11, 29 };
		int count = 0;
		for (int ele : arr) {
			if (isPrime(ele)) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
