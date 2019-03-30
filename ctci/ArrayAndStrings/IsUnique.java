class IsUnique {
    public boolean isUnique(String s) {
        boolean[] a = new char[128];
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


