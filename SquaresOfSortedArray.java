// Since array is sorted, can utilize 2-pointer approach
// Smallest squared value would be near middle, largest would be on outsides
// Start at outsides and work in to middle, while adding to end of new array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        int temp = nums.length - 1;
        
        while (start <= end) {
            int squared = 0;
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                squared = nums[start] * nums[start];
                start++;
            } else {
                squared = nums[end] * nums[end];
                end--;
            }
            // Decrement temp while also assigning it squared value
            result[temp--] = squared;
        }
        return result;
    }
}