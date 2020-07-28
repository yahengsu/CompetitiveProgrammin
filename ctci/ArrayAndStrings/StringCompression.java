import java.lang.StringBuilder;

public class StringCompression {
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();

        char[] c = s.toCharArray();

        char prev = c[0];
        int count = 1;
        for (int i = 1; i < c.length; i++) {
            if (c[i] != prev) {
                sb.append(prev);
                sb.append(count);
                prev = c[i];
                count = 1;
            } else {
                ++count;
            }
        }
        sb.append(prev);
        sb.append(count);

        if (sb.length() > s.length()) {
            return s;
        } 
        return sb.toString();
    }

    public static void main(String[] args) {
        //only a-z
        String s1 = "aabcccccaaa";
        String s2 = "abcdefg";
        System.out.println(compress(s1)); //a2b1c5a3
        System.out.println(compress(s2)); //abcdefg

    }
}