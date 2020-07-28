class CheckPermutation {
    public boolean isPermutation(String a, String b) {
        if(a.length() != b.length())
            return false;
        int[] chars = new int[128];
        int[] chars2 = new int[128];
        for(int i = 0; i < a.length(); i++) {
            char one = a.charAt(i);
            chars[one] += 1;     
            char two = b.charAt(i);
            chars2[two] += 1;       
        }
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != chars2[i])
                return false;
        }

        return true;
    }
}