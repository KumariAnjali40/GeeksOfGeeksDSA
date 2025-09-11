class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        
        // Boolean[][] dp = new Boolean[arr.length][sum + 1];
        
        boolean[] dp = new boolean[sum + 1];
        
        dp[0] = true;
        
        
    //   boolean ans =  solve(arr, sum, 0, dp);
       
    //   return ans;
    
    
    //bottom up 
    
      for(int num : arr){
          
          for(int i = sum; i >= num; i-- ){
              
              if(dp[i - num]){
                  dp[i] = true;
              }
          }
      }
      
      return dp[sum];
        
    }
    
    // public static boolean solve(int [] arr, int sum , int index,  Boolean[][] dp){
       
    //   if(sum == 0){
    //       return true;
    //   }
       
    //   if(index == arr.length){
    //       return false;
    //   }
       
    //   if(dp[index][sum] != null){
    //       return dp[index][sum];
    //   }
       
    //   boolean include = false;
       
    //   if(sum >= arr[index]){
    //       include = solve(arr, sum - arr[index], index+1, dp);
    //   }
       
    //   boolean exclude = solve(arr, sum, index+1, dp);
       
       
    //     dp[index][sum] = include || exclude;
       
    //   return dp[index][sum];
    

    
     
    
    
        
        
    // }
}