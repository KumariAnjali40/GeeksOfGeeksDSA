class Solution {
    String convertToRoman(int n) {
        // code here
        int [] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < value.length; i++){
            while(n >= value[i]){
                sb.append(s[i]);
                n-=value[i];
            }
        }
        
        return sb.toString();
    }
}