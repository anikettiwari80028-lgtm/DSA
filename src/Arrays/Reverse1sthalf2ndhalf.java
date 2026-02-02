package Arrays;

import java.util.Arrays;

public class Reverse1sthalf2ndhalf {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		int i = 0;
		int mid = arr.length / 2;
		int j = arr.length - 1;
		while (i < mid) {
			int temp = arr[i];
			arr[i] = arr[mid];
			arr[mid] = temp;
			i++;
			mid--;
		}
		while (mid < j) {
			int temp = arr[mid];
			arr[mid] = arr[j];
			arr[j] = temp;

			mid++;
			j--;
		}
		System.out.println(Arrays.toString(arr));

	}
//	output :-40,30,20,10,70,60,50

}
