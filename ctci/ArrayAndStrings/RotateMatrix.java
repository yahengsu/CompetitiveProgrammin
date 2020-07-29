import java.util.Arrays;

public class RotateMatrix {
    public static void rotateMatrix(String[][] a) {
        int n = a.length;

        int l = 0;
        int r = n - 1;
        int t = 0;
        int b = n - 1;
        while (l < r) {

            for (int i = l; i < r; i++) {
                String tl = a[t][l+i];
                String tr = a[t+i][r];
                String br = a[b][r-i];
                String bl = a[b-i][l];

                a[t][l+i] = bl;
                a[t+i][r] = tl;
                a[b][r-i] = tr;
                a[b-i][l] = br;
            }
            l += 1;
            r -= 1;
            t += 1;
            b -= 1;
            
        }
    }

    public static void main(String[] args) {
        String[][] a = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}, {"I","J","K", "L"}, {"M", "N", "O", "P"}};
        rotateMatrix(a);
        for(String[] t : a) {
            System.out.println(Arrays.toString(t));

        }
    }
}