package String__;

public class Firstnonrepeatingcharacter {

	public static void main(String[] args) {
		String s = "iaamdeveloper";
		int frqe[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			frqe[s.charAt(i) - 97]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (frqe[s.charAt(i) - 97] == 1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}
