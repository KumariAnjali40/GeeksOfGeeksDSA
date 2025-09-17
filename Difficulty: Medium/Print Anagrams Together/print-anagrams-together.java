class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            
            char [] ch = s.toCharArray();
            
            Arrays.sort(ch);
            
            String newString = new String(ch);
            
            if(map.containsKey(newString)){
               list.get(map.get(newString)).add(s);
            }else {
                ArrayList<String> temp = new ArrayList<>();
                
                temp.add(s); 
                
                list.add(temp);
                
                map.put(newString, list.size() - 1); 
            }
        }
        
        return list;
    }
}
