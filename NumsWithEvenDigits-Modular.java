// This solution followsdivides by 10 to determine number of digits in each array value and has been modularized  
// This solution is slower than the intuitive solution but still very fast (top 90%) and saves much more space compared to the intuitive solution. 
class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for(int i : nums) {
            // Calculate # digits of i using helper function
            int iDigits = getNumDigits(i);
            // If remainder of dividing by 2 is 0, number is even and therefore increase counter
            if (iDigits % 2 == 0) { counter++; }
        }
        return counter;
    }
    
    public int getNumDigits(int n) {
        int numDigits = 1;
        // If dividing by 10 does not equal 0, has > 1 digit left and can further divide by 0
        while((n /= 10) != 0) {
            numDigits++;
        }
        return numDigits;
    }
}
