package Pattern;

import java.util.Scanner;

public class Trangle50To1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();

		printpttern(n);

	}

	public static void printpttern(int n) {

		int star = 1;
		int space = n - 1;
		int num = n * n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.printf(num-- + " ");
			}
			star += 2;
			space--;

			System.out.println();
		}

	}
}
