package Arrays;

public class QtoSum {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 3, 9, 12, 6, 3 };
		System.out.println(isToSum(arr, 12));

	}

	public static boolean isToSum(int arr[], int target) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] + arr[j] == target) {
				return true;
			} else if (arr[i] + arr[j] > target) {
				j--;
			} else {
				i++;
			}

		}
		return false;
	}

}
