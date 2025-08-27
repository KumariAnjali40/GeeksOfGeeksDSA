class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        boolean [] seen = new boolean [n+2];
    
        
        for(int i = 0; i< arr.length; i++){
          
          if(arr[i] <= n+1){
              seen[arr[i]] = true;
          }
        }
        
        for(int i = 1; i <= n+1; i++){
            if(!seen[i]){
                return i;
            }
        }
        
        return -1;
    }
}