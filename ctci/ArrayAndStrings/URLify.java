class URLify {
    public String urlify(String s) {
        String a = s.replaceAll(" ", "%20");
        return a;
    }
}