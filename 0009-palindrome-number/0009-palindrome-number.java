class Solution{
    public boolean isPalindrome(int nums){
        int temp=nums;
        int rev=0;
        while(nums>0){
            int digit=nums%10;
            rev=rev*10+digit;
            nums/=10;
        }
        if(temp==rev){
            return true;
        }else{
            return false;
        }
    }
}