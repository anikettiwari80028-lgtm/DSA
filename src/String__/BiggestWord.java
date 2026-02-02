package String__;

public class BiggestWord {

	public static void main(String[] args) {
		String s = "i am a software developer";

		System.out.println(biggestWord(s));

	}

	public static String biggestWord(String s) {
		String temp = "";
		String biggest = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				temp = temp + c;
			}
			if (c == ' ' || i == s.length() - 1) {
				if (temp.length() > biggest.length()) {
					biggest = temp;

				}
				temp = "";
			}

		}
		return biggest;

	}

}
