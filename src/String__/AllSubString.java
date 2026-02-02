package String__;

public class AllSubString {

	public static void main(String[] args) {

		String s = "ani57*&^ket";
		char[] ch = s.toCharArray();

		char tempAlpha[] = new char[ch.length];
		int index = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
				tempAlpha[index++] = ch[i];
			}
		}

		index = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
				ch[i] = tempAlpha[index++];
			}
		}

		for (int i = 0; i < ch.length; i++) {
			String temp = "";
			for (int j = i; j < ch.length; j++) {
				temp = temp + ch[j];
				System.out.println(temp);
			}
		}

	}

}
