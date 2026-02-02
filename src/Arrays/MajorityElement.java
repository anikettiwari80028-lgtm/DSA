package Arrays;

import java.util.NoSuchElementException;

public class MajorityElement {
	public static void main(String[] args) {
		int[] a = { 8, 8, 8, 7, 6, 5, 7, 8, 8 };
		int majorityElement = printDuplicates(a);
		System.out.println("majority Element is :- " + majorityElement);

	}

	public static int printDuplicates(int[] a) {
		int min = a[0];
		int max = a[0];
		for (int x : a) {
			if (x > max)
				max = x;
			else if (x < min)
				min = x;
		}
		int[] freq = new int[max - min + 1];
		for (int i = 0; i < a.length; i++) {
			freq[a[i] - min]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > a.length / 2)
				return i + min;
		}

		throw new NoSuchElementException("Element is not availaible");
	}
}
