package Arrays;

public class ArrayIsSortedOrNot {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 7, 8, 9 };
		System.out.println(isSortd(arr));
	}

	public static boolean isSortd(int[] arr) {
		boolean sorted = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] > arr[i + 1]) {
				sorted = false;
				break;
			}
		}
		if (sorted) {
			return true;
		} else {
			return false;
		}
	}
}
