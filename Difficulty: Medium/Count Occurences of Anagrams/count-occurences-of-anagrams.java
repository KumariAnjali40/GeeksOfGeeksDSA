// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();
        
        for(int i = 0; i < pat.length(); i++){
            char ch = pat.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch, m.get(ch)+1);
            }else {
                m.put(ch,1);
            }
        }
        
        int left = 0;
        int right = 0;
        int count = 0;
        
        while(right < txt.length()){
               char ch = txt.charAt(right);
            
               map.put(ch, map.getOrDefault(ch, 0)+1);
               
               if(right - left +1 < pat.length()){
                   right++;
               }else if(right - left + 1 == pat.length()){
                   
                   if(map.equals(m)){
                       count++;
                   }
                   
                   char leftChar = txt.charAt(left);
                   
                   map.put(leftChar, map.get(leftChar)-1);
                   
                   if(map.get(leftChar) == 0){
                       map.remove(leftChar);
                   }
                   right++;
                   left++;
               }
        }
        
        return count;
    }
}