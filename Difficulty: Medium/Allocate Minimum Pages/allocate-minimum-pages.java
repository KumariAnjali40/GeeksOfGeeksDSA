class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        
        if(k > n) return -1;
        
        int low = Integer.MIN_VALUE;
        int high = 0;
        
        int ans = -1;
        
        for(int i = 0; i < n; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }
        
        while(low <= high){
            
            int mid = low + (high - low)/2;
            
            if(allocatedBook(arr, n, k, mid)){
                ans = mid;
                
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        
        return ans;
        
    }
    
    public static boolean allocatedBook(int [] arr, int n, int m , int max){
        
        int student = 1;
        int pages = 0;
        
        for(int i = 0; i < n; i++){
            if(pages + arr[i] <= max){
                pages += arr[i];
            } else {
                student++;
                pages = arr[i];
                
                if(student > m){
                    return false;
                }
            }
        }
        
        
        return true;
    }
}