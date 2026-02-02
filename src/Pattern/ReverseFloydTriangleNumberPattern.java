package Pattern;

import java.util.Scanner;

public class ReverseFloydTriangleNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();
		printpttern(n);
	}

	public static void printpttern(int n) {
		int star = 1;
		int num = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= star; j++) {

				System.out.print(num-- + " ");
			}
			star++;
			num = num+2 * i + 1;
//			num=2*i+1
			System.out.println();
		}
	}

}
//num = num+2 * i + 1;
//1 
//3 2 
//6 5 4 
//10 9 8 7 
//15 14 13 12 11
//num=2*i+1
//1 
//3 2 
//5 4 3 
//7 6 5 4 
//9 8 7 6 5 
//11 10 9 8 7 6 
//13 12 11 10 9 8 7 


