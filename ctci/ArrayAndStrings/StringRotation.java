public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        String rotated1 = s1 + s1;
        String rotated2 = s2 + s2;
        if (rotated1.contains(s2) || rotated2.contains(s1)) {
            return true; 
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        String s3 = "water";
        String s4 = "watre";
        System.out.println(isRotation(s1, s2)); // true
        System.out.println(isRotation(s3, s4)); // false
    }
}