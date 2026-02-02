package Arrays;

import java.util.Arrays;

public class QBelowRequirements {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 3, 6 };
		int sum = 0;
		for (int x : arr) {
			sum = sum + x;
		}
		int res[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			res[index++] = sum - arr[i];
		}
		System.out.println(Arrays.toString(res));
	}
}
