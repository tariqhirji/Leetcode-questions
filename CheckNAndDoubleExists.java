// For each value, add it to a hashmap. For each value, check if its double exists already
class Solution {
    public boolean checkIfExist(int[] arr) {
        // Create hashmap to hold values
        HashSet<Integer> encountered = new HashSet<Integer>();
        
        for (int val : arr) {
            // Check if each value has a double or is a double of a value in the set
            if (encountered.contains(val * 2) || (val % 2 == 0 && encountered.contains(val / 2))) {
                return true;
            }
            encountered.add(val);  // Add value to set
        }
        // Case where no doubles are found
        return false;
    }
}