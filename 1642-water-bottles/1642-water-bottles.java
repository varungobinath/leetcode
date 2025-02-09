class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total_bottle = numBottles;
        while(numBottles/numExchange!=0){
            int fullBottle = numBottles/numExchange;
            int empty = numBottles%numExchange;
            total_bottle += fullBottle;
            numBottles = fullBottle+empty;
            // System.out.println(fullBottle+" "+empty);
        }
        return total_bottle;
    }
}