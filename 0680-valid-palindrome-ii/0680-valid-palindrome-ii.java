class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int last=s.length()-1;
        int count1=0;
        while(start<=last){
            if(s.charAt(start)!=s.charAt(last)){
                count1++;
                start++;
            }else{
            start++;
            last--;
        }
        }
        int count2=0;
        start=0;
        last=s.length()-1;
        while(start<=last){
            if(s.charAt(start)!=s.charAt(last)){
                count2++;
                last--;
            }else{
            start++;
            last--;
            }
        }
        if(count1<=1 || count2<=1){
            return true;
        }
        return false;
    }
}

