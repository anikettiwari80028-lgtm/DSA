package String__;

public class StringCompress {
    public static void main(String[] args) {
        String s = "aaabb";
        char[] ch = s.toCharArray();
        String result = "";
        int i = 0;

        while (i < ch.length) {
            char current = ch[i];
            int count = 1;
            int j = i + 1;
            while (j < ch.length && ch[j] == current) {
                count++;
                j++;
            }
            result = result + current + count;
            i = j;
        }
        System.out.println("Compressed string: " + result);
    }
}
