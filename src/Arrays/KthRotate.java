package Arrays;

import java.util.Arrays;

public class KthRotate {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		rightShift1(arr, 0);

	}

	public static void rightShift1(int arr[], int k) {

		int n = arr.length - 1;
		k = k % 10;
		isRotate(arr, 1, n);
		isRotate(arr, k, n);
		
		
		System.out.println(Arrays.toString(arr));
	}

	public static void isRotate(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}
}
