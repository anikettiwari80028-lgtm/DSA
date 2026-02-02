package String__;

public class WordCount {
	public static void main(String[] args) {
		String s = "my name is aniket";
		System.out.println(wordCount(s));

	}

	public static int wordCount(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (i == 0 && c != ' ') {
				count++;
			} else if (c != ' ' && s.charAt(i - 1) == ' ') {
				count++;
			}
		}
		return count;
	}
}
