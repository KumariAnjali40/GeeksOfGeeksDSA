class Solution {
    boolean isPalindrome(String s) {
        // code here
       boolean isPal =  recPalidrome(0,s.length()-1, s);
       
       return isPal;
    }
    
    public static boolean recPalidrome (int left, int right, String s){
        
        if(left >= right){
            return true;
        }
        
        
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        
       return recPalidrome(left+1, right-1, s);
    }
}