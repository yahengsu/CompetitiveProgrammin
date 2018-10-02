static void checkMagazine(String[] magazine, String[] note) {
    ArrayList<String> l = new ArrayList<>();
    for(int i = 0; i < magazine.length; i++) {
        l.add(magazine[i]);
    }
    for(int i = 0; i < note.length; i++) {
        if(!l.contains(note[i])) {
            System.out.println("No");
            return;
        }
        else {
            l.remove(note[i]);
        }
    }
    System.out.println("Yes");
}