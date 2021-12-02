// Solution that concatenates array by doubling size of resulting array 
// then putting base value into same spot AND spot that is + the length away from base spot
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] concatenated_Array = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            // Set index i and i+length to the value in nums
            concatenated_Array[i] = concatenated_Array[i + nums.length] = nums[i];
        }
        return concatenated_Array;
    }
}