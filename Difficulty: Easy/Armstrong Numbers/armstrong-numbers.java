// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int ans = 0;
        int originalValue = n;
        
        while(n > 0){ // 153 --> 15
            int digit = n % 10; //3 --> 5  --> 1
            
             ans = ans + (digit * digit * digit); //  27 --> 27 + 125 = 152 // 153
             
             n = n / 10; // n = 15 --> n = 1;
            
        }
        
        if(ans == originalValue){
            return true;
        }
        
        return false;
    }
}
