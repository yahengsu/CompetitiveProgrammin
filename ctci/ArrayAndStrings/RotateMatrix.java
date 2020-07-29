import java.util.Arrays;

public class RotateMatrix {
    public static String[][] rotateMatrix(String[][] a) {
        a[0][0] = "B";

        return a;
    }

    public static void main(String[] args) {
        String[][] a = {{"A", "B", "C"}, {"D", "E", "F"}, {"G","H","I"}};
        System.out.println(Arrays.toString(rotateMatrix(a)));
    }
}