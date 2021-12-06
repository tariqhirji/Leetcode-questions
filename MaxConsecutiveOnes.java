class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0, maxOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            // If 1, increase counter and compare to previous max
            if (nums[i] == 1) {
                counter++;
                maxOnes = Math.max(maxOnes, counter);
            }
            // If 0, reset counter
            else { counter = 0; }
        }
        return maxOnes;
    }
}