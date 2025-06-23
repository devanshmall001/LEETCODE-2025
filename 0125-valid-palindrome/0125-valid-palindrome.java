class Solution {
    public boolean isPalindrome(String s){
    String s1=s.toLowerCase();
    String s2=s1.replace(" ","");
    String s3=s1.replaceAll("[^a-z0-9]","");
    int start=0;
    int last=s3.length()-1;
    while(start<=last){
        if(s3.charAt(start)!=s3.charAt(last)){
            return false;
        }
        start++;
        last--;
    }
    return true;
    }
}