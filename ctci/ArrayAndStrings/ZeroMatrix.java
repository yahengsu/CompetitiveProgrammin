import java.util.*;

public class ZeroMatrix {
    public static void zeroMatrix(int[][] a) {
        Set<Integer> cols = new HashSet<>();
        Set<Integer> rows = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int col : cols) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (i == col && a[i][j] != 0) {
                        a[i][j] = 0;
                    } 
                }
            }
        }

        for (int row : rows) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (j == row && a[i][j] != 0) {
                        a[i][j] = 0;
                    } 
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{0,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        zeroMatrix(a);

        for(int[] b : a) {
            System.out.println(Arrays.toString(b));
        }
    }
}