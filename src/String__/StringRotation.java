package String__;

public class StringRotation {
	public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean isRotation = false;

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                String temp = "";
                for (int j = 0; j < s1.length(); j++) {
                    temp = temp + s1[(i + j) % s1.length()];
                }
                if (temp.equals(s2)) {
                    isRotation = true;
                    break;
                }
            }
        }
        System.out.println("Is rotation: " + isRotation);
    }
}
