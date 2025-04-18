class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String d[]=s.split("\\s+");
        String ans="";
        for(int i=d.length-1;i>=1;i--){
            ans+=d[i];
            ans+=" ";
        }
        ans+=d[0];
        return ans;
    }
}