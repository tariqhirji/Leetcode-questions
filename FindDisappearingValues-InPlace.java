// Sorted in-place, faster than using ADTs.
// Non-distinct numbers end up in extra spaces of missing values, if any.
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Sort in-place 
        for (int i = 0; i < nums.length; i++) {
            // When sorted, number should be in index + 1 position, otherwise it is not there. 
            while ((nums[i] != i + 1) && (nums[i] != nums[nums[i] - 1])) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1]; // Swap if out of place
                nums[tmp - 1] = tmp;
            }
        }
        List<Integer> missingValues = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            // If value not in correct position, it is missing from array --> Add to missing set
            if (nums[i] != i + 1) {
                missingValues.add(i + 1);
            }
        }
        return missingValues;
    }
}