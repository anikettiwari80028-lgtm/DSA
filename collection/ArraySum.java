package collection;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		int[] a = { 25, 10, 48, 75, 96, 25 };
		// get sum of array elements
		int evenSum = Arrays.stream(a).filter(n -> n % 2 == 0).sum();
		System.out.println("Even element sum is :- " + evenSum);
		// get substract of array elements
		int oddSum = Arrays.stream(a).filter(n -> n % 2 != 0).sum();
		System.out.println("Odd element sum is :- " + oddSum);
		// get max of array
		int max = Arrays.stream(a).max().orElse(0);
		System.out.println("max of array is :- " + max);
		// get min of array
		int min = Arrays.stream(a).min().orElse(0);
		System.out.println("min of array is :- " + min);
		// get average of array
		double avg = Arrays.stream(a).average().orElse(0.0);
		System.out.println("average of array is :- " + avg);
		// remove duplicate in array
		System.out.println("remove duplicate in array");
		a = Arrays.stream(a).distinct().toArray();
		Arrays.stream(a).forEach(n -> System.out.print(n + " "));

	}

}
