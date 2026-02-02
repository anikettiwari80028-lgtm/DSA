package String__;

public class MargeToString {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "java";
		System.out.println(MargeToString(s1, s2));

	}

	public static String MargeToString(String s1, String s2) {
		String result = " ";
		int i = 0;
		while (i < s1.length() && i < s2.length()) {
			result = result + s1.charAt(i) + s2.charAt(i);
			i++;
		}
		return i < s1.length() ? result + s1.substring(i) : result + s2.substring(i);
	}
}
