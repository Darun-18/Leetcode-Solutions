class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full = numBottles;
        int emp = full;
        int dr = full;
        while(emp>=numExchange){
            full=emp/numExchange;
            emp=emp%numExchange;
            dr+=full;
            emp+=full;
        }
        return dr;
    }
}