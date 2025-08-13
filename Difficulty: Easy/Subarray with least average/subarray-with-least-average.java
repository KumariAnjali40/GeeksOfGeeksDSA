// User function Template for Java

class Solution {
    public int least_average(int[] nums, int k) {
        // code here
        // int min = Integer.MAX_VALUE;
        // int minIndex = 0;
        // for (int i = 0 ; i <= nums.length-k; i++){
        //     int sum = 0;
        //   for (int j = i; j < i + k; j++){
                
        //         sum += nums[j];
                
        //     }
        //     int avg = sum/k;
        //     if(avg < min){
        //         min = avg;
        //         minIndex = i;
        //     }
        // }
        
        // return minIndex+1;
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        int minSum = sum;       
        int minIndex = 0;       
        

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            
            if (sum < minSum) {
                minSum = sum;
                minIndex = i - k + 1;
            }
        }
        

        return minIndex + 1;
    }
}