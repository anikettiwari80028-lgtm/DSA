package Arrays;

public class PrintFirstOccurence {

	public static void main(String[] args) {

		int arr[] = { 5, 8, 9, 7, 4, 5, 8, 4, 5, 8, 4 };

		for (int i = 0; i < arr.length; i++) {
			boolean isFirst = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isFirst = false;
					break;
				}
			}

			if (isFirst) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
