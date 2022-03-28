class Solution {
    public int heightChecker(int[] heights) {
        int wrongIndices = 0;
        int[] sorted = new int[101]; // Based on constaint of 100. Gives Space O(1)
        int currentHeight = 0;
        
        // For each height, add it to sorted array
        for (int h : heights) {sorted[h]++;}
        
        // Go through heights are see which are out of order
        for (int i = 0; i < heights.length; i++) {
            
            // If there is no more heights for i, move to next height value
            while(sorted[currentHeight] == 0) {currentHeight++;}
            
            // Check if out of order to increment counter
            if (currentHeight != heights[i]) {wrongIndices++;}
            
            // Reduce value from sorted check
            sorted[currentHeight]--;
        }
        
        return wrongIndices;
    }
}