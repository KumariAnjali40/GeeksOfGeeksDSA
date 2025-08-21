// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        int first = 0;
        int second = 1;
        int ans = 0;
        
        if(n== 0){
            return 0;
        }
        
        if(n == 1){
            return 1;
        }
        
        
        for(int i = 2; i <= n; i++){
            ans = first + second;
            first = second;
            second = ans;
        }
        
        
        return ans;
    }
}