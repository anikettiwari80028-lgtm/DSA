package Arrays;

import java.util.Scanner;

public class PringNFibonacci {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Range = sc.nextInt();

		System.out.println(isFibonacci(Range));

	}

	public static int isFibonacci(int n) {
		int t1 = 0;
		int t2 = 1;
		System.out.print(t1 + " " + t2 + " ");
		for (int i = 2; i <= n; i++) {
			int t3 = t2 + t1;
			System.out.print(t3 + " ");
			t1 = t2;
			t2 = t3;
		}
		return t2;
	}
}
