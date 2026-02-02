package Arrays;

public class PrintOnlyPalindromElement {
	public static void main(String[] args) {
		int arr[] = { 10, 11, 121, 21, 33, 95 };
		for (int ele : arr) {
			if (isPalindrome(ele)) {
				System.out.print(ele + " ");
			}
		}

	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		return temp == rev;
	}
}
