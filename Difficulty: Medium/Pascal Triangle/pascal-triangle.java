class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        long val = 1;
        
        for(int i = 0; i < n; i++){
            
            list.add((int) val );
            
            val = val * (n-i-1)/(i+1);
        }
        
        return list;
        
        
    }
    
   
}