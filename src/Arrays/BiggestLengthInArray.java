package Arrays;

public class BiggestLengthInArray {
	public static void main(String[] args) {
		String[] s1 = { "Aniket", "hello", "how", "here" };
		String larg = s1[0];
		for (String x : s1) {
			if (x.length() > larg.length()) {
				larg = x;
			}
		}
		System.out.println(larg);
	}
}
