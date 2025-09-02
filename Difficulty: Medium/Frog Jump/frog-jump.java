// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        
        int[] dp = new int[height.length+1];
        Arrays.fill(dp, -1);
        
        
       int ans =  findMin(height, height.length-1, dp);
       
       return ans;
    }
    
    public static int findMin(int [] arr, int index, int [] dp){
        if(index == 0){
            return 0;
        }
        
        
        if(dp[index] != -1){
            return dp[index];
        }
        
        
        int left = findMin(arr, index-1, dp)+Math.abs(arr[index]-arr[index-1]);
        
        int right = Integer.MAX_VALUE;
        
        if(index > 1){
            right = findMin(arr, index-2, dp)+Math.abs(arr[index]- arr[index-2]);
        }
        
        dp[index]  = Math.min(left,right);
        
        return dp[index];
    }
}