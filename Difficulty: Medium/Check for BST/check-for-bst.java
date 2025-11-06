/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        boolean ans = isBSTValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        return ans;
    }
    
    
    public boolean isBSTValid(Node curr, int min, int max){
        
         if (curr == null) return true;
        
        if(curr.data < min || curr.data > max) return false;
        
        
        boolean ans = isBSTValid(curr.left, min, curr.data-1) && isBSTValid(curr.right, curr.data+1, max);
        
        return ans;
    }
}