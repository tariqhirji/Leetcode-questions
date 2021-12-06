// Since the input array is sorted, this solution can make use of the 2-pointers pattern
// Loop starts at end and works back to first index as the input array works towards the middle (smallest squared value)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1; 
        int[] squaredArray = new int[nums.length];
            
        // loop starts at end and works backwords since left squared or right squared will be max value
        for (int i = squaredArray.length; i >= 0; i--) {
            // If left index abs value is greater than right, square left and move leftIndex up
            if (Math.abs(nums[leftIndex]) > nums[rightIndex]) {
                squaredArray[i] = nums[leftIndex] * nums[leftIndex];
                leftIndex++;
            // If right index value is greater than abs left, square right and move rightIndex down
            } else {
                squaredArray[i] = nums[rightIndex] * nums[rightIndex];
                rightIndex--;
            }
        }
        return squaredArray;
    }
}
