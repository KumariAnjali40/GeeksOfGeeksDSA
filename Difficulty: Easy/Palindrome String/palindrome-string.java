class Solution {
    boolean isPalindrome(String s) {
        // code here
       // boolean isPal =  recPalidrome(0,s.length()-1, s);

        boolean isPal =  recPalidrome(0, s);
       
       return isPal;
    }
    
    // public static boolean recPalidrome (int left, int right, String s){
        
    //     if(left >= right){
    //         return true;
    //     }
        
        
    //     if(s.charAt(left) != s.charAt(right)){
    //         return false;
    //     }
        
    //    return recPalidrome(left+1, right-1, s);
    // }

     public static boolean recPalidrome (int i , String s){
        
        if(i >= s.length()/2){
            return true;
        }
        
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        
        return recPalidrome(i+1, s);
    }
}
