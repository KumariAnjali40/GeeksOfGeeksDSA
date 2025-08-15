class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        //   int [] temp = new int [arr.length];
    
    //   for(int i = 0; i < arr.length; i++){
    //       temp[i] = arr[arr.length - i -1];
    //   }
       
    //   for(int i = 0; i < arr.length; i++){
    //       arr[i] = temp[i];
    //   }
    
    //   int i = 0;
    //   int j = arr.length-1;
      
    //   while(i < j){
          
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
          
    //       i++;
    //       j--;
          
    //   }
    
      for( int i = 0; i < arr.length/2; i++){
          
          int temp = arr[i];
          arr[i] = arr[arr.length - i -1];
          arr[arr.length -i -1] = temp;
          
          
      }
    }
}
