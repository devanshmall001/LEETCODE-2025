class Solution {
    public int lengthOfLastWord(String s) {
        String D = " ";
        int count = 0;
        boolean started = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (started) {
                    break;
                }
            } else {
                count = count + 1;
                started = true;
            }
        }
        return count;
    }
}
