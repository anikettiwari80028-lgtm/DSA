package String__;

public class HighestFreqChar {

	public static void main(String[] args) {
		String s = "helloiamdevloper";
		System.out.println(highestFreq(s));
	}

	public static char highestFreq(String s) {
		s = s.toLowerCase();

		int[] freq = new int[26];

		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				freq[c - 'a']++;
			}
		}

		char maxChar = 'a';
		int maxFreq = 0;

		
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > maxFreq) {
				maxFreq = freq[i];
				maxChar = (char) (i + 'a');
			}
		}

		return maxChar;
	}
}
