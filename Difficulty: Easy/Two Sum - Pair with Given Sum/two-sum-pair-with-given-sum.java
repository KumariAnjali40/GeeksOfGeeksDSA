class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // a+b = target;
        //a = target-b;
        
        for(int i = 0; i < arr.length; i++){
            
             int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return true;
            }
            
            map.put(arr[i], i);
        }
        
        return false;
    }
}