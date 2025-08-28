class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int right = 0;
        int max = -1;
        
        while(right < s.length()) {
            
            char ch = s.charAt(right);
            
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else {
                map.put(ch, 1);
            }
            
            if(map.size() < k){
                right++;
            }else if(map.size() == k){
                max = Math.max(max, right - left + 1);
                right++;
            }else if(map.size() > k){
                
                while(map.size() > k && left <= right){
                    
                    char leftChar = s.charAt(left);
                    map.put(leftChar, map.get(leftChar)-1);
                    
                    if(map.get(leftChar) == 0){
                        map.remove(leftChar);
                    }
                    
                    left++;
                }
                
                right++;
            }
        }
        
        return max;
    }
}