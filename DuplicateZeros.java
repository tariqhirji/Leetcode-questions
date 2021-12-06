// Duplicate 0's in an array IN-PLACE (src array)
// Fixed-length so some values will be lost
// Must shift digits over when 0 encountered. Easier to start from end 
class Solution {
    public void duplicateZeros(int[] arr) {
        int numValidZeros = 0;
        int size = arr.length - 1;
        
        // First pass: Find number of 0's in array. O(N) time 
        for (int left = 0; left <= size - numValidZeros; left++) {
            if (arr[left] == 0) {
                // EDGE CASE: 0 in boundary value. Check if takes place at boundary of size and # encountered zeros
                if (left == size - numValidZeros) {
                    arr[size] = 0; // shift to end
                    size -= 1; // Shift out
                    break;
                }
                
                // Normal case - non-zero value
                numValidZeros++;
            }
        }
        
        // Second pass: start from end (accounting for additional zeros) and shift right. If zero, duplicate value O(N) time again
        int last = size - numValidZeros;
        
        for (int end = last; end >= 0; end--) {
            // Non-zero case - move to end with zeros accounted for
            if (arr[end] != 0) {
                arr[end + numValidZeros] = arr[end];
            } 
            // Zero case - move to end and next slot
            else {
                arr[end + numValidZeros] = 0;
                numValidZeros--; // Decrement and post value to array again
                arr[end + numValidZeros] = 0;
            }
        }
        
    }
}