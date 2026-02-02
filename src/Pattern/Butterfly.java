package Pattern;

import java.util.Scanner;

public class Butterfly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();

		printpttern(n);
	}

	public static void printpttern(int n) {
		int mid = n / 2 + 1;
		int Sstar = 1;
		int Estar = n;

		if (n % 2 == 0) {
			System.out.println("pattern is not posible");
			return;
		}

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j >= Estar || j<= Sstar)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			if (i < mid) {
				Sstar++;
				Estar--;
			} else {

				Estar++;
				Sstar--;
			}
			System.out.println();
		}
	}

}
