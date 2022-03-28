// SLOW SOLUTION!! TAKES 30MS BECAUSE OF ALL THE SPACE!! attempt of in place is done better
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<Integer>();
        HashSet<Integer> found = new HashSet<Integer>();
        
        // Add all values from nums into found
        for (int i: nums) {found.add(i);}
        
        // Check which values from 1 to n are not in set
        for (int i = 1; i <= nums.length; i++) {
            if (!found.contains(i)) {missing.add(i);}
        }
        return missing;
    }
}