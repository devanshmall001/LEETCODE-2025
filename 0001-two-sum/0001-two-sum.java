class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Start from i+1 to avoid duplicate checks
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return the indices as an array
                }
            }
        }
        // If no solution is found, return an empty array or throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
