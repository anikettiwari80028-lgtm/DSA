package String__;

public class LongestPalindromeSubString {

	public static void main(String[] args) {

		String s = "babad";
		char[] ch = s.toCharArray();
		String maxPal = "";

		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				String temp = "";
				for (int k = i; k <= j; k++)
					temp += ch[k];

				boolean isPal = true;
				for (int l = 0; l < temp.length() / 2; l++) {

				}

			}
		}
	}
}
