class Solution{
    public boolean isPalindrome(int num){
        int temp=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
}