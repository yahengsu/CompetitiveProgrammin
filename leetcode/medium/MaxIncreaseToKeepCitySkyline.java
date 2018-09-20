class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] maxH = new int[grid.length];
        int[] maxV = new int[grid[0].length];
        int height = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > maxV[j]) 
                    maxV[j] = grid[i][j];
                if (grid[i][j] > maxH[i])
                    maxH[i] = grid[i][j];
            }
        }
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                height += Math.min(maxH[i], maxV[j]) - grid[i][j];
            }
        }
        
        
        return height;
    }
}