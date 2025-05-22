class Solution{
    public boolean isPalindrome(int num){
        int temp=num;
        int rev=0;
        if(num<0){
            return false;
        }
        else{
            while(num>0){
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            if(rev==temp){
                return true;
            }
            else{
                return false;
            }
        }
    }
}