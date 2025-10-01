class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int currPowerofFive = 5;
        while(n >= currPowerofFive){
            count += (n/currPowerofFive);
            currPowerofFive *= 5;
        }
        return count;
        
    }
}