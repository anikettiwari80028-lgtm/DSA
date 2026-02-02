package Arrays;

import java.util.Arrays;

public class RemoveArrayOneElement {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		Remove(arr, 30);
	}

	public static void Remove(int arr[], int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				count++;
			}
		}
		int index = 0;
		int res[] = new int[count];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != value) {
				res[index++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
