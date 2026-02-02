package Arrays;

import java.util.Arrays;

public class ReverseArray1 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("original array :- "+Arrays.toString(arr) + " ");

		int i = 1;
		int j = 5;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
		System.out.print("Swap Array :- "+Arrays.toString(arr) + " ");
	}
}
