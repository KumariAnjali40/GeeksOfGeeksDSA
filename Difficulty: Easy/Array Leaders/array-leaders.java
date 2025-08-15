class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        // ArrayList <Integer> list = new ArrayList<>();
        
        // for(int i = 0; i < arr.length; i++){
        //     int j;
            
        //     for(j = i+1; j < arr.length; j++){
                
        //         if(arr[i] < arr[j]){
        //             break;
        //         }
        //     }
            
        //     if(j == arr.length){
        //         list.add(arr[i]);
        //     }
        // }
        
        // return list;

         ArrayList <Integer> list = new ArrayList<>();
        
        int n = arr.length;
        
        int maxRight = arr[n-1];
        list.add(maxRight);
        
        for(int i = n-2; i >=0; i--){
            if(arr[i] >= maxRight){
                list.add(arr[i]);
                maxRight = arr[i];
            }
        }
        
        Collections.reverse(list);
        
        return list;
    }
}
