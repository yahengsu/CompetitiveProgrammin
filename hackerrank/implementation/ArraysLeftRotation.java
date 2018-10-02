static int[] rotLeft(int[] a, int d) {
    for(int i = 0; i < d; i++) {
        int first = a[0];
        for(int j = 1; j < a.length; j++) {
            a[j-1] = a[j];
        }
        a[a.length-1] = first;
    }
    
    return a;
}