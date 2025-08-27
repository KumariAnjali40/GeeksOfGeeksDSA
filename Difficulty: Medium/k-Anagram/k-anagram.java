class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        
        if(s1.length() != s2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        
        int count = 0;
        
        
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }else {
                count++;
            }
        }
        
        if(count <= k){
            return true;
        }
        
        return false;
    }
}