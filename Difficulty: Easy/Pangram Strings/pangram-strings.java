// User function Template for Java

class Solution {
    int isPanagram(String S) {
        // code here
         boolean[] seen = new boolean[26];
         
         String s = S.toLowerCase();
         
         for(int i = 0; i < s.length(); i++){
             
             char ch = s.charAt(i);
             
             if(ch >= 'a' && ch <= 'z'){
                 seen[ch-'a'] = true;
             }
         }
         
         for(boolean i : seen){
             if(!i){
                 return 0;
             }
         }
         
         return 1;
    }
};