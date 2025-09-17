class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int [] res = nextSmall(arr);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < res.length; i++){
            list.add(res[i]);
        }
        
        return list;
        
        
    }
    
    public static int [] nextSmall(int [] arr){
        
        Stack <Integer> st = new Stack<>();
        
        int [] res = new int [arr.length];
        
        for(int i = 0; i < arr.length; i++){
            
            
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            
            
            if(st.isEmpty()){
                res[i] = -1;
            }else {
                res[i] = st.peek();
            }
            
            st.push(arr[i]);
        }
        
        return res;
    }
}