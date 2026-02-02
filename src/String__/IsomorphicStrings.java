package String__;

public class IsomorphicStrings {

	public static void main(String[] args) {

		String s1 = "egg";
		String s2 = "add";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		boolean isIso = true;

		if (ch1.length != ch2.length) {
			isIso = false;
		} else {
			char map1[] = new char[256];
			char map2[] = new char[256];

			for (int i = 0; i < ch1.length; i++) {
				char c1 = ch1[i];
				char c2 = ch2[i];

				if (map1[c1] == 0 && map2[c2] == 0) {
					map1[c1] = c2;
					map2[c2] = c1;
				}

				else if (map1[c1] != c2 || map2[c2] != c1) {
					isIso = false;
					break;
				}
			}
		}

		System.out.println("Are strings isomorphic? " + isIso);
	}
}
