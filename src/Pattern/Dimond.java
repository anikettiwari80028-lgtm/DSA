package Pattern;

import java.util.Scanner;

public class Dimond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();

		printpttern(n);
	}

	public static void printpttern(int n) {
		int star = 1;
		int space = n / 2;// 2
		int mid = n / 2 + 1;// 3
//		int n = 5

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  "); // first loop =2 space
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*   ");
			}
			if (i < mid) {
				star++; // 1,2,3
				space--; // 2,1,0
			} else {
				star--;// 2,1,0
				space++;// 1,2,3

			}
			System.out.println();
		}
	}

}
