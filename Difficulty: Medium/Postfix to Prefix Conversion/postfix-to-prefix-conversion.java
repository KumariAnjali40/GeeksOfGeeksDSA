// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        String ans = convert(post_exp);
        
        return ans;
    }
    
    public static String convert(String s){
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            // +, -, *, /
            if(ch != '+' && ch != '-' && ch != '*' && ch != '/'){
                String str = Character.toString(ch);
                st.push(str);
            }else {
                String newString = "";
                if(!st.isEmpty()){
                    String ch1 = st.pop();
                    String ch2 = st.pop();
                    
                  newString += ch;
                  newString += ch2+ch1;
                   
                  st.push(newString);
                }
            }
        }
        
        String finalAns = "";
        
        while (!st.isEmpty()){
            finalAns += st.pop();
        }
        
        return finalAns;
        
    }
}
