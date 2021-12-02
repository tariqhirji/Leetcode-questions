// This approach is an intuitive solution based on the constraint of max value.
// Time is EXTREMELY efficient but space is not ideal.
class Solution {
    public int findNumbers(int[] nums) {
        // Constraint shows that max number = 10^5 = 100000
        // Even number digits is 10-99, 1000-9999 and 100000
        int counter = 0;
        for (int i : nums) {
            if ((i >= 10 && i <= 99) || (i >= 1000 && i <= 9999) || i == 100000) {
                counter++;
            }
        }
        return counter;
    }
}