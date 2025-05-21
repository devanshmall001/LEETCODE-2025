class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        int emptyBottles = 0;
        
        while (numBottles > 0) {
            sum += numBottles; // Drink all current bottles
            emptyBottles += numBottles; // Add to empty bottles
            numBottles = emptyBottles / numExchange; // Get new full bottles
            emptyBottles = emptyBottles % numExchange; // Remaining empty bottles
        }
        
        return sum;
    }
}
