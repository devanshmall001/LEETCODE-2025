class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Ensure mid is even for comparison with its pair
            if (mid % 2 == 1) {
                mid--;
            }
            
            // If the pair is valid, move to the right half
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                // Move to the left half
                high = mid;
            }
        }
        
        // Low will eventually point to the single element
        return nums[low];
    }
}
