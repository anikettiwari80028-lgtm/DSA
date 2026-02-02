package Arrays;

public class printMaxAndSecondMax {
	public static void main(String[] args) {
		int a[] = { 80, 80, 43, 50, 38, 63, 58, 80 };
		printMaxAndSecondMax(a);
	}

	public static void printMaxAndSecondMax(int[] a) {
		int big = Integer.MIN_VALUE;
		int secBig = Integer.MIN_VALUE;
		for (int x : a) {
			if (x > big) {
				secBig = big;
				big = x;
			} else if (x > secBig && x != big) {
				secBig = x;
			}
		}
		System.out.println("biggest :- " + big);
		System.out.println("secondBiggest:- " + secBig);
	}
}
