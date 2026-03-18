class Solution {
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        boolean[] visited = new boolean[V];
        int count = 0;
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, V);
                count++;
            }
        }
        
        return count;
    }
    
    public static void dfs(int city, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int V) {
        
        visited[city] = true;
        
        for (int j = 0; j < V; j++) {
            if (adj.get(city).get(j) == 1 && !visited[j]) {
                dfs(j, adj, visited, V);
            }
        }
    }
}