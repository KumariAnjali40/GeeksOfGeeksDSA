class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        
        int totalSum = 0;
        
        for(int i = 0; i < n; i++){
            totalSum += arr[i];
        }
        
        if(totalSum % 2 != 0) return false;
        
        int newSum = totalSum / 2;
    
        
        Boolean [][] dp = new Boolean [n][newSum+1];
        
        boolean ans = solve(n, arr, dp, 0, newSum);
        
        return ans;
    }
    
    public static boolean solve(int n, int [] arr, Boolean [][] dp,int index, int sum){
        
        if(sum == 0){
            return true;
        }
        
        if(n == index){
            return false;
        }
    
        
        if(dp[index][sum] != null){
            return dp[index][sum];
        }
        
         boolean include = false;
        
        if(sum >= arr[index]){
            include = solve(n, arr, dp, index+1, sum - arr[index]);
        }
        
        boolean exclude = solve(n, arr, dp, index+1, sum );
        
        dp[index][sum] = include || exclude;
        
        return dp[index][sum];
    }
}