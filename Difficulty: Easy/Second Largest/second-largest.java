class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
           
           if(arr[i] > firstMax){
              secondMax = firstMax;
              firstMax = arr[i];
           }else if(arr[i] > secondMax && arr[i] < firstMax) {
               secondMax = arr[i];
           }
        }
        
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
        
        
    }
}