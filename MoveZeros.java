// Move zeros by copying all non-zero values, then filling remaining spots with zeros
// Keeps same ordering of non-zero values since they maintain same ordering
class Solution {
    public void moveZeroes(int[] nums) {
        
        int counter = 0;
        
        // If non-zero value, just copy in spot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        // Now fill remaining spots with zeros
        while (counter < nums.length) {
            nums[counter] = 0;
            counter++;
        }
    }
}