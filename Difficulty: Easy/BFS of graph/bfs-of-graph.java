class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        int V = adj.size();
        int start = 0;
        
        boolean [] visited = new boolean [V];
        Queue <Integer> q = new LinkedList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int currNode = q.poll();
            
            list.add(currNode);
            
            for(int neighbour : adj.get(currNode)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        
        return list;
        
        
    }
}