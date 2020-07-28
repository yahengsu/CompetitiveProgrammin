public class OneAway {
    public static boolean oneAway(String s1, String s2) {
        String big = s1.length() > s2.length() ? s1 : s2; 
        String small = s1.length() > s2.length() ? s2 : s1;

        int bp = 0;
        int sp = 0;
        boolean oneEdit = false;
        while (bp < big.length() && sp < small.length()) {
            char bc = big.charAt(bp);
            char sc = small.charAt(sp);
            if (bc != sc) {
                if (oneEdit) {
                    return false;
                } else {
                    oneEdit = true;
                }
                if (big.length() > small.length()) {
                    ++bp;
                    continue;
                }
            }
            ++bp;
            ++sp;
        }

        if (big.length() - bp > 1) {
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String[] a = {"pale", "pales", "pale", "pale", "palesss"};
        String[] b = {"ple", "pale", "bale", "bake", "pale"};

        for (int i = 0; i < a.length; i++) {
            System.out.println(oneAway(a[i], b[i])); // t t t f
        }   

    }
}