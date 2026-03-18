class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        boolean [] visited = new boolean [V];
        
        // int currList = adj.get(0);
        
        // for(int item : currList){
        //     dfs(item)
        // }
        
        findDFS(0, list, visited, adj);
        
        
        return list;
    }
    
    public static void findDFS(int node, ArrayList<Integer> list, boolean [] visited, ArrayList<ArrayList<Integer>> adj){
        
       visited[node] = true;
       
       list.add(node);
       
       for(int neighbour : adj.get(node)){
           if(!visited[neighbour]){
               findDFS(neighbour, list, visited, adj);
           }
       }
    }
}