class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] a = J.toCharArray();
        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < a.length; j++){
                if(a[j] == S.charAt(i))
                    count++;
            }
        }
        return count;
    }
}