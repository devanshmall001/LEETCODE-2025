class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {   
            char ch = Character.toLowerCase(s.charAt(i)); 
            int reverseIndex = 26 - (ch - 'a');
            int stringindex = i + 1;
            sum += stringindex * reverseIndex;
        }

        return sum;
    }
}