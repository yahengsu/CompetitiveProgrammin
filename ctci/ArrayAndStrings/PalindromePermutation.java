class PalindromePermutation {
    public boolean isPalindrome(String a) {
        boolean one = false;

        //assume ascii character set (128 possible characters)
        int[] count = new int[128];
        //to be palindrome need the same number of characters
        char[] chars = a.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            count[chars[i]] += 1;
        }


        return true;
    }
}