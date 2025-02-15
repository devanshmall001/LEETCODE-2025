class Solution {
    public int findMin(int[] nums) {
        int min=nums[0],cnt=0;
        for(int i :nums){
            if(min > i){
                return i;
            }
        }
        return nums[0];
    }
}