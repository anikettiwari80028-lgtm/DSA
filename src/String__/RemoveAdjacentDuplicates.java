package String__;

public class RemoveAdjacentDuplicates {
	
	    public static void main(String[] args) {
	        String s = "aabbccdde";
	        char[] ch = s.toCharArray();
	        String result = "";

	        int i = 0;
	        while (i < ch.length) {
	            char current = ch[i];
	            int j = i + 1;
	            while (j < ch.length && ch[j] == current) j++;
	            result = result + current;
	            i = j;
	        }
	        System.out.println("After removing duplicates: " + result);
	    }
	}

