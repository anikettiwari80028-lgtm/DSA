package Arrays;

public class ArrayIsSortedOrNot2 {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 7, 9, 8, 6, 4, 5, 8, 2, 3, 4 };
		isSorted(arr);
	}

	public static void isSorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(arr[i]);
		}
	}
}
