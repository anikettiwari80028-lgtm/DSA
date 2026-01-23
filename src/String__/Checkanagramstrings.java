package String__;

import java.util.Arrays;

public class Checkanagramstrings {

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(isAnagram(arr1, arr2));
	}

	public static boolean isAnagram(char[] arr1, char arr2[]) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
