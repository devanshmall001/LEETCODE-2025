class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {  // start j from i+1 to avoid using the same element
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };  // Return the indices of the two numbers
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}
