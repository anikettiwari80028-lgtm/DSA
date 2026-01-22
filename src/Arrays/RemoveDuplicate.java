package Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 8, 9, 5, 6, 7, 4, 9, 8, 5 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int x : arr) {
			if (x > max) {
				max = x;
			} else if (x < min) {
				min = x;
			}
		}
		int frqe[] = new int[max - min + 1];
		for (int i = 0; i < arr.length; i++) {
			frqe[arr[i] - min]++;
		}
		for (int i = 0; i < frqe.length; i++) {
			if (frqe[i] > 0) {
				System.out.println(i + min);
			}

		}
	}
}
