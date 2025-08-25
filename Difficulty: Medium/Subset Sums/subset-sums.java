// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        solve(arr, 0,0, ans);
        
        return ans;
    }
    
    public static void solve(int [] arr, int index,int sum, ArrayList<Integer>ans){
        
        if(index >= arr.length){
            ans.add(sum);
            return;
        }
        
     
        solve(arr, index+1, sum+arr[index], ans);
    
        solve(arr, index+1, sum ,ans);
        
        
    
    }
}