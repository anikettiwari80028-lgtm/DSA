package String__;

public class Segregate1 {
	public static void main(String[] args) {
		String s = "fkjaj6fasdf55fa4df";
		System.out.println(segregate(s));
	}

	/* insertion order is maintain */
	public static String segregate(String s) {
		String alp = "", num = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 48 && c <= 57) {
				num = num + c;
			} else {
				alp = alp + c;
			}
		}
		return alp + num;
	}
}
