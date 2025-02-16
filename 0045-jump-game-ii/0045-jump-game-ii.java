class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return jump(nums,0,dp);
    }
    public int jump(int [] nums,int i,int[] dp){
        if(i==nums.length-1){
            return 0;
        }
        if(i>=nums.length || nums[i]==0){
            return 46321;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=nums[i];j++){
            min=Math.min(min,1+jump(nums,i+j,dp));
        }
        return dp[i]=min;
    }
}