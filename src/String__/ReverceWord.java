package String__;

public class ReverceWord {
	public class ReverseWord {
		public static void main(String[] args) {
			String s = "Reverse each word in a setence";
			String temp = "";
			String rev = "";
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch != ' ') {
					temp = temp + ch;
				}
				if (ch == ' ' || i == s.length() - 1) {
					rev = temp + " " + rev;
					temp = "";
				}
			}
			System.out.println(rev);
		}
	}
}
