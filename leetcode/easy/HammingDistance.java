package leetcode.easy;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int dist  = 0;
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        int append = Math.max(a.length(),b.length()) - Math.min(a.length(),b.length());
        String fill = "";
        for (int i = 0; i < append; i++) {
            fill += "0";
        }
        if (a.length() > b.length()) {
            StringBuilder sb = new StringBuilder(b);
            sb.insert(0,fill);
            b = sb.toString();
        }
        else {
            StringBuilder sb = new StringBuilder(a);
            sb.insert(0,fill);
            a = sb.toString();
        }
        char[] aC = a.toCharArray();
        char[] bC = b.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (aC[i] != bC[i]) {
                dist++;
            }
        }
        return dist;
    }
}
