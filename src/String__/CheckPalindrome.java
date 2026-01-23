package String__;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = "naman";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		char ch[] = s.toCharArray();
		while (i < j) {
			if (ch[i] != ch[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
