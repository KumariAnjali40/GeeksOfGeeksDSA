class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        // HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // for(int i = 0; i < arr.length; i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);

        //     }else {
        //         map.put(arr[i], 1);
        //         list.add(arr[i]);
        //     }
        // }
        
        // return list;
        
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                continue;
            }else {
                list.add(arr[i]);
            }
        }
        
        return list;
   
    }
}
