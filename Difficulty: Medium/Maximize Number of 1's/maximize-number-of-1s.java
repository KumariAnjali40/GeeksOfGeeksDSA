class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int i = 0;
        int j = 0;
        int zero = 0;
        int max = 0;
        
        while(j < arr.length){
            
            if(arr[j] == 0){
                zero++;
            }
            
            while(zero > k){
                if(arr[i] == 0){
                    zero--;
                }
                i++;
            }
            
            
            max = Math.max(max, j-i+1);
            j++;
        }
        
        return max;
    }
}