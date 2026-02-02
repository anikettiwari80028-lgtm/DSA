package String__;

public class InsertMiniPalindrome {

	public static void main(String[] args) {
		String s = "abca";
		int n = s.length();
		char[] ch = s.toCharArray();
		int minInsert = n;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
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
				if (isPal && temp.length() > 0) {
					int insert = n - temp.length();
					if (insert < minInsert)
						minInsert = insert;
				}
			}
		}
		System.out.println("Minimum insertions for palindrome: " + minInsert);
	}

}
