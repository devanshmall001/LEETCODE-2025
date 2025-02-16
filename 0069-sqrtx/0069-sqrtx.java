class Solution {
    public int mySqrt(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of negative numbers is not defined in real numbers.");
        }
        return (int) Math.sqrt(x); // Use Math.sqrt(x) and cast to int
    }
}
