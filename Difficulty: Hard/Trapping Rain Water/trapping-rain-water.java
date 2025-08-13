class Solution {
    public int maxWater(int arr[]) {
      // code here
        
     //find the max from the left and max from the right;
     // then minimum from both of them
     // then exclude self height 
     // at the end find the max from that
    
    
    // int max = 0;
    // for(int i = 0; i < arr.length; i++){
    //     int leftMax = arr[i];
    //     int rightMax = arr[i];
        
    //     for(int j = 0; j < i ; j++){
    //         leftMax = Math.max(leftMax, arr[j]);
    //     }
        
    //     for(int j = i+1; j < arr.length; j++){
    //         rightMax = Math.max(rightMax, arr[j]);
    //     }
        
    //     max += Math.min(leftMax,rightMax)-arr[i];
    // }
    // return max;
    int res = 0;
    int n = arr.length;
    
    int [] prefixMax = new int [n];
    int [] suffixMax = new int [n];
    
      prefixMax[0] = arr[0];
      suffixMax[n-1] = arr[n-1];
     
     
     for(int i = 1; i < n; i++){
         prefixMax[i] = Math.max(prefixMax[i-1], arr[i]);
     }
     
     for(int i = n-2; i >= 0; i--){
         suffixMax[i] = Math.max(suffixMax[i+1], arr[i]);
     }
     
     for(int i = 0; i < n; i++){
         res+= Math.min(prefixMax[i],suffixMax[i])-arr[i];
     }
     return res;
    }
}
