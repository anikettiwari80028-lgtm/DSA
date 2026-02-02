package Pattern;

import java.util.Scanner;

public class Flag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();
		printpttern(n);

	}

	public static void printpttern(int n) {
		if (n % 2 == 0) {
			System.out.println("Pattern is not posible");
			return;
		}
		int mid = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 | i == n || j == 1 || j == n || i == j || i + j == n + 1 || i == mid || j == mid)

					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++)
			System.out.println("**");
	}
}
