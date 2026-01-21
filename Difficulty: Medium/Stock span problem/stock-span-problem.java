class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> list = new ArrayList<>();
    
        
        for(int i = 0; i < n; i++){
            list.add(1);
        }
        
        // for(int i = 1; i < n; i++){
        //     for (int j = i-1; j >=0; j--){
        //         if(arr[i] >= arr[j]){
        //             list.set(i, list.get(i)+1);
        //         }else {
        //             break;
        //         }
        //     }
        // }
        
        // return list;
        
        
        Stack <Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                list.set(i, i+1);
            }else {
                 list.set(i, i - st.peek());
            }
            
            st.push(i);
        }
        
        return list;
    }
}