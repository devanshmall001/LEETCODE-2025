class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0,m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                m++;
                if(n<m)
                n=m;
            }else m=0;
        }
        return n;
    }
}