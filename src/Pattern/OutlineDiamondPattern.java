package Pattern;

public class OutlineDiamondPattern {
	public static void main(String[] args) {
		HardPattern(7);
	}

	public static void HardPattern(int n) {
		int mid = n / 2 + 1;
		int space = n / 2;
		int star = 1;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= space; s++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				if (j == 1 || j == star) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			if (i < mid) {
				space--;
				star += 2;
			} else {
				star -= 2;
				space++;
			}
			System.out.println();
		}
	}
}
