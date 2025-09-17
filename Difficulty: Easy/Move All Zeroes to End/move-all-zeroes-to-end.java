class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        
        int n = arr.length;
        
        int [] store = new int [n];
        int count = 0;
        int j = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count++;
            }else {
                store[j] = arr[i];
                j++;
            }
        }
        
        int k = n - count;
        
        while(count > 0 && k < arr.length){
            store[k] = 0;
            k++;
        }
        
        for(int i = 0; i < store.length; i++){
            arr[i] = store[i];
        }
        
        // int j = 0;
        
        // for(int i = 0; i < n; i++){
        //     if(arr[i] != 0){
        //         arr[j] = arr[i];
        //         j++;
        //     }
            
        // }
        
        // while(j < n){
        //     arr[j] = 0;
        //     j++;
        // }
    }
}