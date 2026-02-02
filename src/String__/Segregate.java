package String__;

public class Segregate {
	public static void main(String[] args) {
		String s = "fkjaj6fasdf55fa4df";
		System.out.println(segregate(s));

	}

	
	public static String segregate(String s) {

		String result = " ";
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c >= 48 && c < 57) {
				result = result + c;
			} else {
				result = c + result;
			}
		}
		return result;
	}
}
