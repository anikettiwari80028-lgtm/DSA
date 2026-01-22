package Arrays;

public class FindSmallest {
	public static void main(String[] args) {
		int arr[] = { 9, 58, 56, 21, 42, 5, 7 };
		int min = Integer.MAX_VALUE;
		int secmin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] < secmin && secmin != min) {
				secmin = arr[i];
			}
		}
		System.out.println(secmin);

	}
}
