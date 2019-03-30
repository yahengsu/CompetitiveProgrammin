class IsUnique {
    public boolean isUnique(String s) {
        HashSet<Character> a = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if(a.contains(b)) {
                return false;
            }
            else {
                a.add(b);
            }
        }
        return true;
    }

    public boolean isUniqueNoDataStructures(String s) {
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
}


