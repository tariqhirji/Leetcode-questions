// Replace elements with its greater right-handed value. End is -1
class Solution {
    public int[] replaceElements(int[] arr) {
        // Keep track of current max and end
        int max = -1;
        int N = arr.length - 1;
        
        // Start loop at end
        for (int i = N; i >= 0; i--) {
            // Create temp to hold value then set to max
            int temp = arr[i];
            arr[i] = max;
            // Change max to greater value for next iteration 
            max = Math.max(max, temp);
        }
        return arr;
    }
}