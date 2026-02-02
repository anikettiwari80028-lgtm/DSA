package String__;

public class RemoveExtraSpace {
	
		public static void main(String[] args) {

			String s = "  java   is   good  ";
			String result = "";
			boolean space = false;

			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);

				if (ch != ' ') {
					result = result + ch;
					space = false;
				} else {
					if (!space) {
						result = result + ' ';
						space = true;
					}
				}
			}

			if (result.charAt(result.length() - 1) == ' ') {
				result = result.substring(0, result.length() - 1);
			}

			System.out.println(result);
		}
	}

