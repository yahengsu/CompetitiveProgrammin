
class IsUnique {
    public static boolean isUnique(String s) {
        boolean[] a = new boolean[128];
        for(int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if(a[b]) {
                return false;
            }
            else {
                a[b] = true;
            }
        }
        return true;
    }

    public static boolean isUniqueNoDataStructures(String s) {
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < s.length(); j++) {
                if(i == j)
                    continue;
                else {
                    if(s.charAt(i) == s.charAt(j))
                        return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "hello this is not unique";
        String test2 = "abcdefghijk12345";
        System.out.println(isUnique(test1));
        System.out.println(isUnique(test2));
    }
}


