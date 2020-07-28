class URLify {
    public static String urlify(String s, int len) {
        char[] a = new char[s.length()];
        
        int p = s.length() - 1;
        for (int i = len - 1; i >=0; i--) {
            if (s.charAt(i) == ' ') {
                a[p] = '0';
                a[p-1] = '2';
                a[p-2] = '%';
                p -= 3;
            } else {
                a[p] = s.charAt(i);
                --p;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        String toUrl = "Mr John Smith    ";
        int toUrlLen = 13;
        System.out.println(urlify(toUrl, toUrlLen));
    }
}