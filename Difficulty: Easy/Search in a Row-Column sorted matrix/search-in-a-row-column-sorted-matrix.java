class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        boolean isPresent = false;
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == x){
                    isPresent = true;
                    break;
                }
            }
        }
        return isPresent;
    }
}