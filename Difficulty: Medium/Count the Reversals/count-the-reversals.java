class Solution {
    public int countMinReversals(String s) {
        // code here
        
        if (s.length() % 2 != 0) return -1;
        
        Stack <Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            
           char ch = s.charAt(i);
           
          if(ch == '{'){
               st.push(ch);
           } else { 
              if (!st.isEmpty() && st.peek() == '{') {
              st.pop();
             } else {
              st.push(ch);
             }
           }
        }
        
        int countOpen = 0;
        int countClose = 0;
        
         while (!st.isEmpty()) {
            if (st.pop() == '{') {
                countOpen++;
            } else {
                countClose++;
            }
        }

        return (countOpen + 1) / 2 + (countClose + 1) / 2;
    }
}