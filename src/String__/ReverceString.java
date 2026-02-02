package String__;

public class ReverceString {
	public static void main(String[] args) {
		String s = "Aniket";
		int i = 0;
		int j = s.length() - 1;
		char ch[] = s.toCharArray();
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		System.out.println(ch);
	}
}
