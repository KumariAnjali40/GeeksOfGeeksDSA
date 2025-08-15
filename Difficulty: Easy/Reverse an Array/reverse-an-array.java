class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
       int [] temp = new int [arr.length];
    
       for(int i = 0; i < arr.length; i++){
           temp[i] = arr[arr.length - i -1];
       }
       
       for(int i = 0; i < arr.length; i++){
           arr[i] = temp[i];
       }
    }
}