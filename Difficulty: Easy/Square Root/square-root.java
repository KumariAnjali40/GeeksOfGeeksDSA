class Solution {
    int floorSqrt(int n) {
        // code here
        long left = 0;
        long right = n;
        long ans = 0;
        
        while(left <= right){
            
            long mid = left + (right - left)/2;
            long square = mid * mid;
            
            
            if (square == n) {
                return (int) mid;
            }
            
            if(square < n){
                ans = mid;
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        
         return (int) ans;
    }
}