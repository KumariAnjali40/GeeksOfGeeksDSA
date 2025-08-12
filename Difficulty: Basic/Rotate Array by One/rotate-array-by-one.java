// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length-1;
        int temp = arr[n];
        for(int i = n; i >=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}