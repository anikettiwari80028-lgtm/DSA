package String__;

public class FrquencyArrayINString {
	public static void main(String[] args) {
		String s = "nikettiwAAAarihello";
		PrintFrquency(s);

	}

	public static void PrintFrquency(String s) {
		int[] frqe = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90) {
				frqe[c - 65]++;

			} else if (c >= 97 && c <= 122) {
				frqe[c - 97]++;
			}

		}
		for (int i = 0; i < frqe.length; i++) {
			if (frqe[i] > 0) {
				System.out.println((char) (i + 65) + "  is:  " + frqe[i] + "  times");
			}
		}
	}
}
