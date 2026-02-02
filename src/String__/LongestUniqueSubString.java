package String__;

public class LongestUniqueSubString {
	
	    public static void main(String[] args) {
	        String s = "abcabcbb";
	        char[] ch = s.toCharArray();
	        int maxLen = 0;
	        String result = "";

	        for (int i = 0; i < ch.length; i++) {
	            String temp = "";
	            for (int j = i; j < ch.length; j++) {
	                char c = ch[j];
	                boolean found = false;
	                for (int k = 0; k < temp.length(); k++) {
	                    if (temp.charAt(k) == c) {
	                        found = true;
	                        break;
	                    }
	                }
	                if (found) break;
	                temp = temp + c;
	            }
	            if (temp.length() > maxLen) {
	                maxLen = temp.length();
	                result = temp;
	            }
	        }
	        System.out.println("Longest substring without repeating: " + result);
	    }
	}
