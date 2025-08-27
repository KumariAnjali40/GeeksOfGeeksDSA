// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        
        int left = 0;
        int right = 0;
        
        int sum = 0;
         int ans = Integer.MAX_VALUE;
        
        while (right < arr.length){
            sum = sum + arr[right];
            
            while(sum > x){
                ans = Math.min(ans, right-left+1);
                sum-=arr[left];
                left++;
                
            }
            
          right++;
            
        }
        return (ans == Integer.MAX_VALUE) ? 0 : ans;
        
        
    }
}
