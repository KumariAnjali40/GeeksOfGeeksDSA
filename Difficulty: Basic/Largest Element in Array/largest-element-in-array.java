class Solution {
    public static int largest(int[] arr) {
        // code here
        if(arr.length == 0){
            return 0;
        }
        
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            
            max = Math.max(max, arr[i]);
        }
        
        return max;
    }
}
