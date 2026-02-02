package collection;

import java.util.Arrays;

public class removeDupllicate_useStream {
	public static void main(String[] args) {
		int[] a = { 12, 10, 25, 45, 10, 12 };
		a = Arrays.stream(a).distinct().toArray();
		Arrays.stream(a).forEach(n -> System.out.println(n));

	}
}
