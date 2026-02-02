package Arrays;

public class checkPalindromicArrayOrNot {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 30, 20, 10 };
		System.out.println(isPalindrome(arr));
	}

	public static boolean isPalindrome(int arr[]) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] != arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
