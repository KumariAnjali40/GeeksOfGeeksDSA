// User function Template for Java

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            // arr[i] --> present then currentindex-arr[i](index) <= k
            
            if(map.containsKey(arr[i]) && Math.abs(i - map.get(arr[i]))<= k){
                return true;
            }else {
                map.put(arr[i], i);
            }
            
            
        }
        
        return false;
    }
}