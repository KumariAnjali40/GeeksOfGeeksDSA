class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
       int n = s.size();
       Stack<Integer> st = new Stack<>();
       
       int i = 0;
      
       while(i < n/2){
           st.push(s.pop());
           i++;
       }
       
        s.pop();
       
       //st --> 50,40
       //s --> 30,20,10
       
       while(!st.isEmpty()){
          s.push(st.pop());
       }

        
       
    }
}