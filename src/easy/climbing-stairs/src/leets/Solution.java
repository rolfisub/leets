package leets;

public class Solution {
    public static int climbStairs(int n) throws Exception { 
        int boardSize = n;
        if (boardSize > 45) {
            throw new Exception("nope");
        }
        if (boardSize == 0 || boardSize == 1) {
            return 1;
        }
        
        int[] dp = new int[boardSize+1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= boardSize; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[boardSize];
    }
}
