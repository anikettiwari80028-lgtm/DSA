package Arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 4, 7, 5, 2, 4, 5, 6 };
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
