static String twoStrings(String s1, String s2) {
    int[] seen = new int[26];
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    for(int i = 0; i < a.length; i++) {
        seen[a[i] - 97] = 1;
    }
    for(int i = 0; i < b.length; i++) {
        if(seen[b[i] - 97] == 1)
            return "YES";
    }
    return "NO";
    
}