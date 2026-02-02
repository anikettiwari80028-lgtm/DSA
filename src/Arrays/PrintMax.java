package Arrays;

public class PrintMax {
	public static void main(String[] args) {
		int arr[] = { 21, 52, 45, 95, 86 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);

	}
}
