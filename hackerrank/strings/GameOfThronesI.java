static String gameOfThrones(String s) {
    int[] count = new int[26];
    boolean hasOne = false;
    char[] a = s.toCharArray();
    for(int i = 0; i < a.length; i++) {
        count[a[i] - 97]++;
    }
    for(int i = 0; i < count.length; i++) {
        if(count[i]%2 == 1) {
            if(hasOne)
                return "NO";
            else
                hasOne = true;
        }
    }
    return "YES";

}