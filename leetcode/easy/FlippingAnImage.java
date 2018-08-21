class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] a : A) {
            int n = a.length;
            for(int i = 0; i < n/2; i++) {
                int temp = a[i];
                a[i] = a[n-i-1];
                a[n-i-1] = temp;
            }
            for(int i = 0; i < n; i++) {
                if(a[i] == 0) {
                    a[i] = 1;
                }
                else if(a[i] == 1) {
                    a[i] = 0;
                }
            }
        }
        return A;
    }
}