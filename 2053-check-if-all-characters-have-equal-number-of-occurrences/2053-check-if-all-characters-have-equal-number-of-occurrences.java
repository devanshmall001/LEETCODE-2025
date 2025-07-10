class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int frequency = 0;
        for (int i = 0; i < 26; i++) {
            int freqAtIndex = freq[i];
            if (freqAtIndex != 0) {
                if (frequency == 0) {
                    frequency = freqAtIndex; 
                } else if (freqAtIndex != frequency) {
                    return false;
                }
            }
        }   
        return true;
    }
}