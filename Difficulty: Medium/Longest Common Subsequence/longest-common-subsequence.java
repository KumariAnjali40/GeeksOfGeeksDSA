class Solution {
    static int lcs(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int [][] dp = new int [n+1][m+1];
        return findLcs(s1, s2, n, m, dp);
    }
    
    public static int findLcs(String s1, String s2, int n, int m, int [][] dp){
        
        // if(s1.length() == n || s2.length() == m ){
        //     return 0;
        // }
        
        // if(s1.charAt(n) == s2.charAt(m)){
        //     return 1+findLcs(s1,s2,n+1,m+1);
        // }else {
        //     return Math.max(findLcs(s1,s2,n+1,m), findLcs(s1,s2,n,m+1));
        // }
        
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[n][m];
    }
}