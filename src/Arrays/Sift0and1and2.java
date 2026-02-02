package Arrays;

public class Sift0and1and2 {
	public static void sift0and1and2(int arr[]) {
		int countZero = 0;
		int countOne = 0;
		for (int x : arr) {
			if (x == 0) {
				countZero++;
			} else if (x == 1) {
				countOne++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i < countZero) {
				arr[i] = 0;
			} else if (i < countZero + countOne) {
				arr[i] = 1;
			} else {
				arr[i] = 2;
			}
		}

	}
}
