// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int n = arr.length;
        int [] []dp = new int [n][4];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                dp[i][j] = -1;
            }
        }
        
        
        
        int ans = findMax(arr, n-1, 3, dp);
        
        return ans;
    }
    
    public static int findMax(int arr[][], int index, int last, int [][] dp){
        
        if(index == 0){
             int max = 0;
             
             for(int i = 0; i < 3; i++){
                 if(i  != last){
                     max = Math.max(max, arr[0][i] );
                 }
             }
             
             return max;
        }
        
        // int max = 0;
        
        // for(int i = 0; i < 3; i++){
        //     if(i != last){
        //         int curr = arr[index][i] + findMax(arr, index-1, i);
                
        //         max = Math.max(curr, max);
        //     }
        // }
        
        // return max;
        
        if(dp[index][last] != -1){
            return dp[index][last];
        }
        
        int max = 0;
        
         
        for(int i = 0; i < 3; i++){
            if(i != last){
                int curr = arr[index][i] + findMax(arr, index-1, i, dp);
                
                max = Math.max(curr, max);
            }
        }
        
        return dp[index][last] = max;
        
        
        
    }
}