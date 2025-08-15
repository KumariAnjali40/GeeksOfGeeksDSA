class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            int j;
            
            for(j = i+1; j < arr.length; j++){
                
                if(arr[i] < arr[j]){
                    break;
                }
            }
            
            if(j == arr.length){
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}
