package String__;

public class CostumeSplite {

	public static void main(String[] args) {
		String s = "hello world java";
		char[] ch = s.toCharArray();
		String temp = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				temp = temp + ch[i];
			} else {
				System.out.println(temp);
				temp = "";
			}
		}
		if (temp.length() > 0)
			System.out.println(temp);
	}
}
