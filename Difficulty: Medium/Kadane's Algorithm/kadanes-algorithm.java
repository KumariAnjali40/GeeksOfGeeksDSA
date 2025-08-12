class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max = Integer.MIN_VALUE;
        
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i; j < arr.length; j++){
        //         int sum = 0;
        //         for(int k = i; k <= j; k++){
        //             sum += arr[k];
                    
        //             max = Math.max(max, sum);
        //         }
        //     }
        // }
        
        // for(int i = 0; i < arr.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < arr.length; j++){
        //         sum+=arr[j];
        //         max = Math.max(max, sum);
        //     }
        // }
        
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++){
             sum += arr[i];
             max = Math.max(max, sum);
             
             if(sum < 0){
                 sum = 0;
             }
        }
        
        return max;
    }
}
