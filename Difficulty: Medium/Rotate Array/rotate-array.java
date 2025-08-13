// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        d = d % arr.length; 
        if (d == 0) return;
        int [] temp = new int [d];
        
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        
        for(int i = d; i < arr.length; i++){
            arr[i-d] = arr[i];
        }
        
        int j = 0;
        
        for(int i = arr.length - d; i < arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
    }
}