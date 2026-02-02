package Arrays;

public class nonRepeting {
	public static void main(String[] args) {
		int arr[] = { 5, 9, 7, 8, 4, 62, 8 };
		System.out.println(nonReption(arr));
	}

	public static int nonReption(int arr[]) {
		boolean repeting = true;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i] == arr[j]) {

					repeting = true;
					return arr[i];
					
				}
			}
		}
		return -1;
	}
}
