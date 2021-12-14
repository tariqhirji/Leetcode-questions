// Remove duplicates in-place using 2 pointers
class Solution {
    public int removeDuplicates(int[] nums) {
        
     // edge case - input array is null
     if (nums == null) {
         return 0;
     }

      // First element is already unique so start at index 1 
      int writeIndex = 1;
      for (int readIndex = 1; readIndex < nums.length; readIndex++) {
          // Check if element is different than previous index
          if (nums[readIndex] != nums[readIndex - 1]) {
              // If different, write into next available index and increment index to write next in
              nums[writeIndex] = nums[readIndex];
              writeIndex++;
          }
      }
      // 'k' value of # values to keep (number of unique values in array)
      return writeIndex;
    }
}