// Remove all instances of val in-place. returns a modified array without val and n - #vals size
// 2 pointer-approach: 1 ahead and 1 behind. stays behind by 1, copying value if not val
class Solution {
    public int removeElement(int[] nums, int val) {
        int behind = 0;
        for (int ahead = 0; ahead < nums.length; ahead++) {
            // If not the value, then copy to previous pointer
            // Instances of val are overwritten by not being copied
            if (nums[ahead] != val) {
                nums[behind] = nums[ahead];
                behind++;
            } 
        }
        return behind;
    }
}