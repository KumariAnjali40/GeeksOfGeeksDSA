// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        int k = d;
        if(d >= n){
            k = d % n;
        }
        
        
        rotateArr(arr, 0, k-1);
        rotateArr(arr, k, n-1);
        rotateArr(arr, 0, n-1);
    }
    
    public static void rotateArr(int [] arr, int i, int j){
        while (i < j) {
            int temp = arr[i]; 
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
    }
}
