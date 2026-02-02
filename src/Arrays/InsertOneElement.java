package Arrays;

import java.util.Arrays;

public class InsertOneElement {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println(Arrays.toString(insert(arr1, 2, 200)));

	}

	public static int[] insert(int[] arr1, int index, int value) {
		if (index < 0 || index > arr1.length) {
			System.out.println("element cant be insert");
			return arr1;
		}
		int[] arr2 = new int[arr1.length + 1];
		arr2[index] = value;
		for (int i = 0; i < arr2.length; i++) {
			if (i < index) {
				arr2[i] = arr1[i];
			} else {
				arr2[i] = arr1[i - 1];
			}
		}
		return arr2;
	}
}
