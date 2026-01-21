
class Solution {
    static int removeConsecutiveSame(String[] arr) {
        // Your code goes here
        Stack <String> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            
            if(!st.isEmpty() && st.peek().equals(arr[i])){
              while(!st.isEmpty() && st.peek().equals(arr[i])){
                st.pop();
              }
            }else {
                st.push(arr[i]);
            }
            
    
        }
        
        return st.size();
    }
}