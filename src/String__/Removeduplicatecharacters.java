package String__;

public class Removeduplicatecharacters {

	public static void main(String[] args) {
		String s = "helloworld";
		int frqe[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			frqe[s.charAt(i) - 97]++;
		}

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			if (frqe[index] > 0) {
				System.out.print(s.charAt(i));
				frqe[index] = 0;
			}
		}
	}
}
