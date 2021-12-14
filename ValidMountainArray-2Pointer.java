// Check if valid mountain by using 2 pointers
// Read through whole array and keep iterating as long as value follows mountain
// Mountain is satisfied is start ends up at end while meeting conditions
class Solution {
    public boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        // Check bounds before comparing -- same bounds as intuitive version 
        // Work inwards from both edges
        while (start + 1 < arr.length && arr[start] < arr[start + 1]) {start++;}
        while (end > 0 && arr[end - 1] > arr[end]) {end--;}
        
        // valid if start and end meet at same value
        // Account for edge cases (peak at 0 and at N)
        return start > 0 && start == end && end < arr.length - 1;        
    }
}
// Still O(n) time since could iterate until middle
// Faster than climbing up then down since while loops can be processed in parallel  