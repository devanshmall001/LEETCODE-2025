class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1); // ✅ Fixed: getOrderdefault → getOrDefault
        }

        int ans = 0;
        boolean hasOdd = false;

        for (char key : map.keySet()) { 
            int freq = map.get(key);
            if (freq % 2 == 0) {
                ans += freq;
            } else {
                ans += freq - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            ans += 1; 
        }

        return ans;
    }
}
