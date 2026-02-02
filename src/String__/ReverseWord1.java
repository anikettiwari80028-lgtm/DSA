package String__;

public class ReverseWord1 {
	public static void main(String[] args) {
		String s = "java hello";
		System.out.println(reverceString(s));

	}

	public static String reverceString(String s) {

		String word = "";
		String temp = "";
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c != ' ') {
				temp = temp + c;
			}
			if (c == ' ' || i == s.length() - 1) {
				word = temp + " " + word;
				temp = "";
			}
		}
		return word;
	}
}
