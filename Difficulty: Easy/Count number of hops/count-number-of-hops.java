// User function Template for Java

class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static int countWays(int n) {
        // add your code here
        int [] dp = new int [n+1];
        
        dp[0] = 1;
        if(n >= 1){
            dp[1] = 1;
        }
        
        if(n>=2){
            dp[2] = 2;
        }
        
        for(int i = 3; i <= n; i++){
             dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        
        return dp[n];
        
        
    }
}
