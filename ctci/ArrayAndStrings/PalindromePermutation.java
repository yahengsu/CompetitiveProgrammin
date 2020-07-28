class PalindromePermutation {
    public static boolean isPalindrome(String a) {

        a = a.replaceAll("\\s", "");
        a = a.toLowerCase();
        //assume ascii character set (128 possible characters)
        int[] count = new int[128];
        //to be palindrome need the same number of characters
        char[] chars = a.toCharArray();
        
        for(int i = 0; i < chars.length; i++) {
            count[chars[i]] += 1;
        }


        boolean isOddSeen = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 1) {
                if (!isOddSeen && a.length() % 2 == 1) 
                    isOddSeen = true;
                else
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "Tact Coa";
        String s2 = "not palindrome";

        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false
    }
}