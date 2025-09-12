class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) >= 2){
                list.add(key);
            }else {
                continue;
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}