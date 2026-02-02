package String__;

public class ReverseOnlyWordAlphabet {

	public static void main(String[] args) {

		String s = "aniket& tiwa4ri5 is8 a*54 hello";
		char[] ch = s.toCharArray();

		int i = 0;

		while (i < ch.length) {

			if (!((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))) {
				i++;
				continue;
			}

			int start = i;
			

			while (i < ch.length && ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))) {
				i++;
			}
			int end = i - 1;

			while (start < end) {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
		}

		System.out.println(new String(ch));
	}

}
