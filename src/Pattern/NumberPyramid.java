package Pattern;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();
		printpttern(n);
	}

	public static void printpttern(int n) {
		int star = 1;
		int num = n*(n+1)/2;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= star; j++) {

				System.out.print(num++ + " \t");
			}
			star++;
			
		num=num-(2*i+1);
			System.out.println();
		}
	}
}
