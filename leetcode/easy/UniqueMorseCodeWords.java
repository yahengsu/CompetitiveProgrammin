public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] morse = new String[words.length];

        for(int i = 0; i < words.length; i++) {
            String a = words[i];
            String temp = "";
            for(char b : a.toCharArray()) {
                temp += alphabet[b - 97];
            }
            morse[i] = temp;
        }
        HashSet<String> set = new HashSet<>();
        for(String m : morse) {
            if (!set.contains(m)) {
                set.add(m);
            }
        }

        return set.size();
    }
}
