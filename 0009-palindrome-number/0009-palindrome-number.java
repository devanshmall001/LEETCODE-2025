class Solution{
    public boolean isPalindrome(int num){
        int rev=0;
        int temp=num;
        while(num!=0 && num>0){
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