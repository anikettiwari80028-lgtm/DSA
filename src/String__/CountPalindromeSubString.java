package String__;

public class CountPalindromeSubString {

	public static void main(String[] args) {
		String s = "aaa";
		char[] ch = s.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				String temp = "";
				for (int k = i; k <= j; k++)
					temp = temp + ch[k];

				boolean isPal = true;
				for (int l = 0; l < temp.length() / 2; l++) {
					if (temp.charAt(l) != temp.charAt(temp.length() - 1 - l)) {
						isPal = false;
						break;
					}
				}
				if (isPal)
					count++;
			}
		}
		System.out.println("Total palindromic substrings: " + count);
	}
}
