package Pattern;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = sc.nextInt();

		printpttern(n);

	}

	public static void printpttern(int n) {

		int star = 1;
		int num=64+n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
         System.out.print((char)(num)+" ");
			}
			star++;
			num --;
			System.out.println();
		}

	}
}
//E 
//D D 
//C C C 
//B B B B 
//A A A A A 


