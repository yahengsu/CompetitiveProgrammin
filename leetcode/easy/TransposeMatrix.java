package leetcode.easy;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for(int i = 0; i < A[0].length; i++) {
            for(int j = 0; j < A.length; j++) {
                B[i][j] = A[j][i];

            }
        }
        return B;
    }
}
