package Arrays;

public class FrquencyEachEmelent {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 5, 5, 100, 20, 10 };
		isarr(arr);
	}

	public static void isarr(int []arr) {
		int freq[] = new int[256];
	
		for (int x : freq) {
			freq[x]++;
		}

		
		for (int i = 0; i <= 100; i++) {
			if (freq[i] > 0) {
				System.out.println(i + " -> " + freq[i]);
			}
		}
	}
}
