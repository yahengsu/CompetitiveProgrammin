package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] row: A) {
            int n = row.length;
            for (int i = 0; i < n/2; i++) {
                int temp = row[i];
                row[i] = row[n-i-1];
                row[n-i-1] = temp;
            }
        }
        return A;
    }
}
