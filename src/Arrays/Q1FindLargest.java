package Arrays;

public class Q1FindLargest {
	public static void main(String[] args) {
		int arr[] = { 9, 58, 56, 21, 42, 5, 7 };
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] > secmax && secmax != arr[i]) {
				secmax = arr[i];
			}

		}
		System.out.println(secmax);

	}
}
