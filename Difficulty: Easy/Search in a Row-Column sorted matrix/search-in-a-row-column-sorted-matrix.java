class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        // boolean isPresent = false;
        
        // for(int i = 0; i < mat.length; i++){
        //     for(int j = 0; j < mat[0].length; j++){
        //         if(mat[i][j] == x){
        //             isPresent = true;
        //             break;
        //         }
        //     }
        // }
        // return isPresent;
        
       int rows = mat.length;
        int cols = mat[0].length;

        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (mat[i][j] == x) {
                return true;
            } else if (mat[i][j] > x) {
                j--; 
            } else {
                i++; 
            }
        }

        return false;
    }
}