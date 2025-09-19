// User function Template for javascript

/**
 * @param {number} n
 * @return {number[]}
 */

class Solution {
    factorial(n) {
        // code here
       let ans = 1n;  
        let a = BigInt(n);

        while (a > 1n) {
            ans *= a;
            a--;
        }

        return ans.toString().split("").map(Number);
        
        
    }
}
