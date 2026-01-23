package String__;

public class Printduplicatecharacters {
	public static void main(String[] args) {
		String s = "iaamdeveloper";
		int frqe[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			frqe[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < frqe.length; i++) {

			if (frqe[i] > 1) {
				System.out.println((char) (i + 97));
			}
		}
	}
}
