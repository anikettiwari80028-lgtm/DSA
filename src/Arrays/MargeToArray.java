package Arrays;

public class MargeToArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 1, 3, 5, 4, 6, 8, 10 };
		int marge[] = new int[arr1.length + arr2.length];
		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			marge[index++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			marge[index++] = arr2[i];
		}
		for (int x : marge) {
			System.out.print(x + " ");
		}

	}

}
