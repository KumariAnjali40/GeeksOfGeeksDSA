// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {
        Arrays.sort(nums);
        
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        solve(nums, set, list, 0);
        
        return new ArrayList<>(set);
    }
    
    public static void solve(int [] arr, Set<ArrayList<Integer>> ans, ArrayList<Integer>curr, int index){
        
        if(index >= arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        curr.add(arr[index]);
        solve(arr, ans, curr, index+1);
        
        curr.remove(curr.size()-1);
        
        solve(arr, ans, curr, index+1);
    }
}