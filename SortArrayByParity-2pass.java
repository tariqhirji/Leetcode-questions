// Sort by even first then odds. DONE IN-PLACE
// Uses 2 pointers, 1 at start, 1 at end. 
// If start is odd and end is even, swap spots. 
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            // Case where start is odd and end is even - swap positions
            if (nums[start] % 2 > nums[end] % 2) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            // Even in right spot
            if (nums[start] % 2 == 0) {
                start++;
            }
            if (nums[end] % 2 == 1) {
                end--;
            }
        }
        return nums;
    }
}