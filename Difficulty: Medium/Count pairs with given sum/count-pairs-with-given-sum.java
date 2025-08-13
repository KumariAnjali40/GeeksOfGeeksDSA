class Solution {
    int countPairs(int arr[], int target) {
        // code here
        // int count = 0;
        
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[i]+arr[j] == target){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        int count = 0;
    
        HashMap<Integer, Integer> map = new HashMap<>();
        
         for (int num : arr){
            
            if(map.containsKey(target-num)){
                count += map.get(target-num);
            }
            
            map.put(num, map.getOrDefault(num,0)+1);
             
             
         }
        
        return count;
    }
}