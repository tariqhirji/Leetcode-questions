// Read through whole array and keep iterating as long as value follows mountain
// Mountain is satisfied is start ends up at end while meeting conditions
// O(n) time since iterating through whole array to meet mountain conditions
class Solution {
    public boolean validMountainArray(int[] arr) {
        int counter = 0;
        int end = arr.length;
        
        // Climb mountain - keep start in proper indices and check it is less than next index
        while (counter + 1 < end && arr[counter] < arr[counter + 1]) {
            counter++;
        }
        
        // Will stop looping when at end or when peaked
        // Edge cases - peaked at start or end
        if (counter == 0 || counter == end - 1) {
            return false;
        }
        
        // Climb down mountain
        while (counter + 1 < end && arr[counter] > arr[counter + 1]) {
            counter++;
        }
        
        // Valid mountain if counter is on end after iterating through
        return counter == end - 1;
    }
}