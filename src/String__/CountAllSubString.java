package String__;

public class CountAllSubString {

	public static void main(String[] args) {
		String s = "abc";
		char[] ch = s.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			String temp = "";
			for (int j = i; j < ch.length; j++) {
				temp = temp + ch[j];
				System.out.println(temp);
				count++;
			}
		}
		System.out.println("Total substrings: " + count);
	}
}
