class URLify {
    public static String urlify(String s) {
        String a = s.replaceAll(" ", "%20");
        return a;
    }

    public static void main(String[] args) {
        System.out.println(urlify("HELLO WORLD"));
    }
}