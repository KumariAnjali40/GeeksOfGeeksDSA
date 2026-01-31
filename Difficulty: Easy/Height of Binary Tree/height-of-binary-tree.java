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
        int ans = findHeight(root);
        
        return ans;
    }
    
    public static int findHeight(Node root){
        if(root == null) return -1;
        int a = findHeight(root.left);
        int b = findHeight(root.right);
        
        return Math.max(a,b)+1;
    }
}