/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        if(root == null) return 0;
        
        int depth = 0;
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                 Node curr = q.poll();
                
                if(curr.left != null) q.add(curr.left);
                
                if(curr.right != null) q.add(curr.right);
            }
            
            depth++;
        }
        
        return depth-1;
        
        
    }
}