package Pattern;

public class Crose {
	public static void main(String[] args) {
		isprint(5);
	}
	
	public static void isprint(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
